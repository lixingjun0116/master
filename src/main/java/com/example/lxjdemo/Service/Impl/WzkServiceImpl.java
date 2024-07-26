package com.example.lxjdemo.Service.Impl;

import com.example.lxjdemo.Service.WebService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: WzkServiceImpl
 * @Author : Administrator
 * @Date :2023/7/17  17:31
 * @Description: TODO
 * @Version :1.0
 */
@Service("WzkServiceImpl")
public class WzkServiceImpl implements WebService {
    @Override
    public String getName() {
        return "我是WzkServiceImpl################################";
    }
}
