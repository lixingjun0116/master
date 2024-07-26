package com.example.lxjdemo.Test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
 
import java.io.*;
import java.net.URL;
import java.util.*;
 /**
  * 漫画爬取
  * @author lixingjun
  * @date 2024/6/22 13:15
  *
  */
public class test {
    public static void main(String[] args) throws IOException {
        long start= System.currentTimeMillis();
        Map<String, String> url = getUrl("https://www.kuaikanmanhua.com/");
        downImg(url, "d:/data/copy/");
        long end=System.currentTimeMillis();
        System.out.println("本次下载共用时"+(end-start));
    }
 
    /**
     * 根据漫画名获得所有章节
     *
     * @param
     * @return
     * [url=home.php?mod=space&uid=686208]@AuThor[/url] sanmuyuan
     * [url=home.php?mod=space&uid=686237]@date[/url] 2020/8/28
     */
    private static Map<String, String> getUrl(String url) {
        try {
            Document document = Jsoup.connect(url).get();
            //获取所有章节节点
            Elements li = document.getElementsByClass("list").get(0).getElementsByTag("li");
            int size = li.size();
            Map<String, String> map = new HashMap<>(size);
            for (int i = 0; i < size; i++) {
                Element element = li.get(i);
                String href = element.childNode(1).attr("href");
                String cataName = element.childNode(1).childNode(1).childNode(0).toString();
                map.put(cataName, "https://m.gufengmh8.com" + href);
            }
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    private static void downImg(Map<String, String> url, String path) {
        for (String key : url.keySet()) {
            int i = 0;
            while (true) {
                String url1 = url.get(key);
                if (i != 0) {
                    String substring = url1.substring(url1.lastIndexOf("/"), url1.lastIndexOf("."));
                    url1 = url1.replace(substring, substring + "-" + i);
                }
                Document document = null;
                try {
                    document = Jsoup.connect(url1).get();
                } catch (IOException e) {
                    try {
                        Thread.sleep(3000);
                        document = Jsoup.connect(url1).get();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                String src = getSrc(document);
                System.out.println(src);
                if ("https://res.xiaoqinre.com/images/default/cover.png".equals(src) || "https://img001.shmkks.com/images/default/cover.png".equals(src)) {
                    break;
                }
                try {
                    downImg(src,path+key,i+".jpg");
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
 
    }
 
    private static void downImg(String url,String path,String imageName) throws Exception {
        URL uri = new URL(url);
        InputStream in = uri.openStream();
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fo = new FileOutputStream(new File(path+"/"+imageName));//文件输出流
        byte[] buf = new byte[1024];
        int length = 0;
        System.out.println("开始下载:" + url);
        while ((length = in.read(buf, 0, buf.length)) != -1) {
            fo.write(buf, 0, length);
        }
        //关闭流
        in.close();
        fo.close();
        System.out.println(imageName + "下载完成");
 
    }
 
    private static String getSrc(Document document) {
        Elements elementsByClass = null;
        Node childNode = null;
        elementsByClass = document.getElementsByClass("chapter-content");
        childNode = elementsByClass.get(0).childNode(3).childNode(0);
        String src = null;
        List<Node> nodes = childNode.childNodes();
        for (Node node : nodes) {
            if (!"".equals(node.toString().trim())) {
                src = node.attr("src");
            }
        }
        return src;
    }
}