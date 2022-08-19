package com.javaStudy.week1.JavaMethod;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //5! 5*4*3*2*1
        System.out.println(f(5));
        Scanner sc = new Scanner(System.in);
        System.out.println("What function do you want?");
        System.out.print("!"+"\t");
        System.out.print("count"+"\t");
        System.out.print("subtract"+"\t");
        System.out.print("plus"+"\t");
        System.out.print("divide"+"\t");
        System.out.println("or exit");
        String s = sc.nextLine();
        if (s.equals("!")){
            int x = sc.nextInt();
            System.out.println("The result of "+x+"! is "+f(x));
        }else if (s.equals("count")){
            System.out.println("How many numbers be counted?");
            int x = sc.nextInt();
            int[] a = new int[x];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("The result is "+count(a,x-1));
        }else if (s.equals("subtract")){
            System.out.println("How many numbers be subtracted?");
            int x = sc.nextInt();
            int[] a = new int[x];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("The result is "+subtract(a,x-1));
        }else if (s.equals("plus")){
            System.out.println("How many numbers be plus?");
            int x = sc.nextInt();
            int[] a = new int[x];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("The result is "+plus(a,x-1));
        }else if (s.equals("divide")){
            System.out.println("How many numbers be divided?");
            int x = sc.nextInt();
            int[] a = new int[x];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("The result is "+divide(a,x-1));
        }else if (s.equals("exit")){
            System.out.println("close.");
            sc.close();
        }else {
            System.out.println("wrong!");
            sc.close();
        }

    }

    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
    //作业
    public static int count(int[] a,int x){
        if (x==0){
            return a[0];
        }else {
            return a[x]+count(a,x-1);
        }
    }

    public static int subtract(int[] a,int x){
        if (x==0){
            return a[0];
        }else {
            return a[x]-subtract(a,x-1);
        }
    }

    public static int plus(int[] a,int x){
        if (x==0){
            return a[0];
        }else {
            return a[x]*plus(a,x-1);
        }
    }

    public static int divide(int[] a,int x){
        if (x==0){
            return a[0];
        }else {
            return a[x]/(divide(a,x-1));
        }
    }
}
