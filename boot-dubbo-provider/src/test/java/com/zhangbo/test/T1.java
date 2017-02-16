package com.zhangbo.test;

import java.lang.reflect.Field;

/**
 * Created by zhangbo on 2017/2/10.
 */
public class T1 {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;

        method(a, b);

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    static void method(Integer a, Integer b){
//        System.out.println("a=100,b=200");
//        System.setOut(new java.io.PrintStream(System.out, true) {
//            @Override
//            public void println(String x) {
////                super.println(x + '0');
//            }
//        });

        try {
            Class<Integer> integerClass = Integer.class;
//            integerClass.getDeclaredField()

            Field field = integerClass.getDeclaredField("value");
            field.setAccessible(true);

            field.set(a, 100);
            field.set(b, 200);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
