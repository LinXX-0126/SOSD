package com.javaStudy.week1.JavaProcessControl;

public class ProC10_DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            sum += i++;
        }while (i<=100);
        System.out.println(sum);

        //while 和 do...while 的区别：
        int a = 0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("=============");

        do {
            System.out.println(a);
        }while (a<0);
    }
}
