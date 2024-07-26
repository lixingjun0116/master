package com.example.lxjdemo.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Stream
 * @Author : Administrator
 * @Date :2023/7/18  15:20
 * @Description: TODO
 * @Version :1.0
 * Stream练习
 */
public class Stream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aa", "ff", "vv", "dd", "jj", "tt", "ee", "mm", "uu");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
