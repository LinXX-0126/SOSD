package com.javaStudy.week2.multithreading.exer;

/**
 * 练习：创建两个分线程，其中一个遍历一百以内偶数，另一个奇数
 *
 *
 */
public class ThreadDemo extends Thread{
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread2 t2 = new MyThread2();
////        ThreadDemo01 t2 = new ThreadDemo01();
//        t1.start();
//        t2.start();

        //创建Thread类的匿名子类的方式
        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    if (i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }


}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }


}class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
