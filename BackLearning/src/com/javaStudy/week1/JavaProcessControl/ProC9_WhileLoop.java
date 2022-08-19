package com.javaStudy.week1.JavaProcessControl;

public class ProC9_WhileLoop {
    public static void main(String[] args) {
        //输出0~100
        int i = 0;
        while (i<=100){
            System.out.println(i++);
        }

//        while (true){
//            //等待客户端连接
//            //定时检查
//            //......
//        }

        //计算1+2+3+...+100
        int x = 1;
        int sum = 0;
        while (x<=100){
            sum += x++;
        }
        System.out.println(sum);
    }
}
