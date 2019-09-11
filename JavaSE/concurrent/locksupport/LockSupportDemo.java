package com.han.thread.locksupport;

import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            LockSupport.park();//阻塞当前线程
            System.out.println(Thread.currentThread().getName() + "---被唤醒了。");
        });
        t.start();

        try {
            System.out.println(Thread.currentThread().getName() + "---在跑。");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LockSupport.unpark(t);//唤醒t线程
    }
}
