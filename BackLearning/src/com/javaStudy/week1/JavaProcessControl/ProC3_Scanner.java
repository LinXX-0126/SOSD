package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC3_Scanner {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束并输出执行结果：
        Scanner sc = new Scanner(System.in);
        //和
        double sum = 0;
        //计算输入多少数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和与统计
        while (sc.hasNextDouble()){
            double x = sc.nextDouble();
            m = m+1;//m++
            sum = sum + x;
            System.out.println("你输入了第"+m+"个数据，当前sum结果为："+sum);
        }
        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"个数的平均值是:"+(sum/m));

        sc.close();
    }
}
