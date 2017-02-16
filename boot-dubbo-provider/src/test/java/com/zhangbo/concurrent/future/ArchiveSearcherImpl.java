package com.zhangbo.concurrent.future;

/**
 * Created by zhangbo on 2017/2/13.
 */
public class ArchiveSearcherImpl implements ArchiveSearcher {
    @Override
    public String search(String target) {
        System.out.println("search thread : " + Thread.currentThread().getName());
        return "target: " + target;
    }
}
