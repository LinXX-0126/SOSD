package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC6_Structure {
    //if双选择结构
    public static void main(String[] args) {
        //考试分数大于60及格，小于60不及格
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        if (score>60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

        sc.close();
    }
}
