package com.javaStudy.week1.JavaProcessControl;

public class ProC16_Goto {
    public static void main(String[] args) {
        //打印101-150之间的左右质数

        int count = 0;
        outer:for (int i=101;i<150;i++){
            for (int j=2;j<i/2;j++){
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i+" ");
        }
    }
}