package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC2_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");

        if (sc.hasNextInt()){
            i = sc.nextInt();
            System.out.println("整数数据："+i);
        }else {
            System.out.println("输入的不是整数数据！");
        }

        System.out.println("请输入小数：");
        if (sc.hasNextFloat()){
            f = sc.nextFloat();
            System.out.println("小数数据："+f);
        }else {
            System.out.println("输入的不是小数数据！");
        }
        sc.close();
    }
}
