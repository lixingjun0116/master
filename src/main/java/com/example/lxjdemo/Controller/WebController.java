package com.example.lxjdemo.Controller;

import com.example.lxjdemo.Service.SpringUtils;
import com.example.lxjdemo.Service.WebService;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: WebController
 * @Author : Administrator
 * @Date :2023/7/17  17:26
 * @Description: TODO
 * @Version :1.0
 * 页面测试
 */
@RestController
@RequestMapping("/web")
public class WebController {

    @GetMapping("/index")
    public String index(@RequestParam("number") Integer number) {
        String beanName = "ServiceImpl";
        switch (number) {
            case 0:
                beanName = "Wzk" + beanName;
                break;
            case 1:
                beanName = "Lxj" + beanName;
                break;
            default:
                return beanName;
        }
        try {
            WebService webService = SpringUtils.getBean(beanName);
            return webService.getName();
        } catch (Exception e) {
            System.out.println("错误信息为：" + e);
            return "获取bean失败！";
        }
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
