package com.javaStudy.week1.JavaProcessControl;

public class ProC17_PracticeDebug {
    public static void main(String[] args) {
        //打印三角形
        for (int i = 1; i<=5; i++) {
            for (int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
