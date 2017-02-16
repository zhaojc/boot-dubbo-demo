package com.zhangbo.concurrent.future;

import java.util.concurrent.*;

/**
 * Created by zhangbo on 2017/2/13.
 */
public class App {

    ExecutorService executor = Executors.newCachedThreadPool();
    ArchiveSearcher searcher = new ArchiveSearcherImpl();

    public void showSearch(final String target) throws InterruptedException {
        Future<String> future = executor.submit(new Callable<String>() {
          public String call() {
              return searcher.search(target);
          }});

      displayOtherThings(); // do other things while searching

      try {
        displayText(future.get()); // use future
      } catch (Exception ex) {
//          cleanup();
          return;
      }
    }

    private void displayText(String s) {
        System.out.println("future ---- "  + s);
    }

    private void displayOtherThings() {
        for (int i = 0; i < 5; i++) {
            System.out.println("do other thing : " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new App().showSearch("xxx");
    }

}
