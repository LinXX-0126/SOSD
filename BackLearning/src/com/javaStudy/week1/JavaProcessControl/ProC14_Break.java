package com.javaStudy.week1.JavaProcessControl;

public class ProC14_Break {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("==============");
    }
}
