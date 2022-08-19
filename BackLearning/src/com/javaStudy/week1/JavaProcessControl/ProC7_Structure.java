package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC7_Structure {
    //if多选择结构
    public static void main(String[] args) {
        //考试分数大于60及格，小于60不及格
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        if (score==100){
            System.out.println("恭喜，满分！");
        }else if (score<100 && score>=90){
            System.out.println("A级");
        }else if (score<90 && score>=80){
            System.out.println("B级");
        }else if (score<80 && score>=70){
            System.out.println("C级");
        }else if (score<70 && score>=60){
            System.out.println("D级");
        }else if (score<60 && score>=0){
            System.out.println("不及格");
        }else{
            System.out.println("成绩不合法");
        }

        sc.close();
        // 一个语句至多有一个else语句，在所有的else if 语句之后
        // 语句可以有若干个else if 语句，必须在else语句之前
        // 一旦其中一个else if 语句为true，其他的else if 以及else语句都将跳过执行
    }
}
