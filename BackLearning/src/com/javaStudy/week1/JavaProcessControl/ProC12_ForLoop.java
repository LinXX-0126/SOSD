package com.javaStudy.week1.JavaProcessControl;

public class ProC12_ForLoop {
    public static void main(String[] args) {
        //practice 1 计算0-100之间奇数和偶数的和
        int oddSum = 0;
        int evenSum = 0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                evenSum+=i;
            }else {
                oddSum+=i;
            }
        }
        System.out.println("Odd numbers'sum is "+oddSum);
        System.out.println("Even numbers'sum is "+evenSum);
        System.out.println("=============================");

        //practice 2 用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
        //用for:
        int n = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%5==0){
                n++;
                if (n%3==0){
                    System.out.println(i);
                }else {
                    System.out.print(i+" ");
                }

            }
        }
        System.out.println();
        System.out.println("=================");
        //方法2：
        for (int i = 1; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("=============");

        //practice 3 打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();

        }

    }
}
