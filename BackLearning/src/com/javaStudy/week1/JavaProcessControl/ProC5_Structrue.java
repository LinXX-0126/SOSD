package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC5_Structrue {
    //if单选择结构
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = sc.nextLine();
        //equals:判断字符是否相等
        if (s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("End.");
        sc.close();
    }



}
