package com.zhangbo.test;

import java.util.Arrays;

/**
 *
 *
 * Created by zhangbo on 2017/2/14.
 */
public class T2 {

    public static void main(String[] args) {
        // 将以下字符串按单词倒序输出"!world hello!hi"
        String s = "hi!hello world!";

        String[] split = s.split("[^a-zA-Z]");


        System.out.println(Arrays.toString(split));
        int length = split.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(split[i]);
        }
    }

}
