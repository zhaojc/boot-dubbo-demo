package com.zhangbo.demo.print;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

/**
 * Created by zhangbo on 2017/2/7.
 */
public class PrintServiceTest1 {

    public static void main(String[] args) {

//        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();

        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);

        for (PrintService print: printServices) {
            System.out.println(print.getName());
        }

//        DocFlavor.URL.TEXT_HTML_UTF_8



    }

}
