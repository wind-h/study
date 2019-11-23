package javabaseclasslibrary;

import java.io.IOException;

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors());
        System.out.println("最大可用内存数：" + rt.maxMemory()/1024/1024 + "M");
        System.out.println("空闲内存数：" + rt.freeMemory()/1024/1024 + "M");
        System.out.println("总内存数：" + rt.totalMemory()/1024/1024 + "M");
        try {
            //里面的是记事本
            rt.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Object();
    }
}
