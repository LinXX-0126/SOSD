package com.javaStudy.week1.JavaMethod;

public class Demo02 {
    public static void main(String[] args) {
        int max1 = max(10,20);
        System.out.println(max1);
        double max2 = max(10,20);
        System.out.println(max2);
    }
    //比大小
    public static int max(int num1, int num2){
        int result=0;
        if (num1==num2){
            return 0;//中止方法
        }
        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }

    //比大小(重载)
    public static double max(double num1, double num2){
        double result=0;
        if (num1==num2){
            System.out.println("num1=num2");
            return 0;//中止方法
        }
        if (num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }
}
