package com.javaStudy.week2.multithreading.learning;

/**
 * 测试ThRead中的常用方法
 * 1.start():启动当前线程；调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setNmae():设置当前线程的名字
 * 6.yield():释放当前CPU控制权
 * 7.join():在线程A中调用线程B的join(),此时线程A就进入阻塞状态，直到B完全执行完以后，A才结束阻塞
 * 8.stop():已过时，当执行此方法是，强制结束当前线程
 * 9.sleep(long millitime):让当前线程睡眠，即阻塞，指定时间为毫秒
 *10.isAlive():判断当前线程是否还存活
 */
class HelloThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                try{
                    sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if (i%20==0){
                this.yield();
            }
        }
    }

    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
//        h1.setName("线程一");
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if (i==20){
                try{
                    h1.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        System.out.println(h1.isAlive());

    }

}
