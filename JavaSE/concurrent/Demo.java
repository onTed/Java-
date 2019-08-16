package com.mid.admin.controller;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo {

//阻塞队列里有10个元素，初始化带有3个线程的线程池，跑3个线程分别去阻塞队列里取数据执行

    public static void testExecutors() throws Exception{
        ExecutorService es = Executors.newFixedThreadPool(3,
                new ThreadFactoryBuilder().setNameFormat("thread-%d").build());
        final LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        for (int i = 0; i < 2000; i++) {
            deque.add(i + "");
        }


        es.submit(new Runnable() {
            @Override
            public void run() {
                while(!deque.isEmpty()) {
                    System.out.println(deque.poll() + "-->" +Thread.currentThread().getName());
                }
            }
        });

        es.submit(new Runnable() {
            @Override
            public void run() {
                while(!deque.isEmpty()) {
                    System.out.println(deque.poll() + "-->" +Thread.currentThread().getName());
                }
            }
        });

        es.submit(new Runnable() {
            @Override
            public void run() {
                while(!deque.isEmpty()) {
                    System.out.println(deque.poll() + "-->" +Thread.currentThread().getName());
                }
            }
        });

        Thread.sleep(10000l);

    }

    public static void main(String[] args) throws Exception {
        testExecutors();
    }


}
