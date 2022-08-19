package com.javaStudy.week2.multithreading.learning;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()方法 -->将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类对象
 * 4.通过此对象调用start()
 *
 * 例子：遍历100以内的所有偶数
 *
 */

// 1.创建一个继承于Thread类的子类
    class MyThread extends Thread{
//2.重写Thread类的run()方法
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread t1 = new MyThread();

        //4.通过此对象调用start():启动当前线程，调用当前线程的run()
        t1.start();
//        t1.run(); //这样就不会多开一个线程，仍然在主线程当中运作
//        System.out.println("hello");

        //我们需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();
        //如下操作仍然在main线程中执行
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i+"*******");//获取线程名
            }
        }
    }

}
