package com.example.lxjdemo.Service.Impl;

import com.example.lxjdemo.Service.WebService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: LxjWebServiceImpl
 * @Author : Administrator
 * @Date :2023/7/17  17:29
 * @Description: TODO
 * @Version :1.0
 */
@Service("LxjServiceImpl")
public class LxjWebServiceImpl implements WebService {
    @Override
    public String getName() {
        return "我是LxjWebServiceImpl################################";
    }
}
