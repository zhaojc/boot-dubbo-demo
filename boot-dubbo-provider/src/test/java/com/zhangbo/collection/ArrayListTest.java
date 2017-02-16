package com.zhangbo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangbo on 2017/2/9.
 */
public class ArrayListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("4");

//        String[] arr = new String[2];
//
//        String[] strings = list.toArray(arr);
//
//        System.out.println(Arrays.toString(strings));
//
//        System.out.println(arr == strings);

        System.out.println(list);
        list.remove("4");

        System.out.println(list);

    }

}
