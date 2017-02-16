package com.zhangbo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Created by zhangbo on 2017/2/9.
 */
public class CollectionSizeTest {

    public static void main(String[] args) {

        List<Long> list = new ArrayList(2100000000);

        for (long i = 0; i < 2500000000L; i++) {
            list.add(1L);
        }

        System.out.println(list.size());

    }

}
