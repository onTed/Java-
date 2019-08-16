package com.han.thread.demo;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThread08 extends Thread {



    public static void main(String[] args)
    {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(1,20,10, TimeUnit.SECONDS,new LinkedBlockingDeque(10));
        for(int i=0;i<15;i++) {
            tpe.submit(new MyThread(i+1));
        }



    }
    static class MyThread implements Runnable {
        private int index;
        public MyThread(int index) {
            this.index = index;
        }


        public void run() {
            System.out.println(this.index);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
