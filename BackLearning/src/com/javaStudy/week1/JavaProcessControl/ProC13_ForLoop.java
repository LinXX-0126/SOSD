package com.javaStudy.week1.JavaProcessControl;

public class ProC13_ForLoop {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40,50,60}; //定义了一个数组
        //遍历数组的元素
        for (int x:numbers){
            System.out.println(x);
        }
        System.out.println("==========");

        for (int i=0;i<=5;i++){
            System.out.println(numbers[i]);
        }
    }
}
