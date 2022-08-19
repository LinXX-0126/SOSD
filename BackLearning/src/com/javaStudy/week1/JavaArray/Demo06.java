package com.javaStudy.week1.JavaArray;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,9090,31231,543,23,3,23};
//        System.out.println(a);[I@4554617
        // 打印数组元素Arrays.toString
        //System.out.println(Arrays.toString(a));
        Arrays.sort(a);//数组进行排序
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,2,4,0);//数组填充
        System.out.println(Arrays.toString(a));

    }
    public  static void printArray(int[]a){

    }
}


