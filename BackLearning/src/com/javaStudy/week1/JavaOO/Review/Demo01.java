package com.javaStudy.week1.JavaOO.Review;

import java.io.IOException;

//Demo1 类
public class Demo01 {

    //main 方法
    public static void main(String[] args) {

    }
    //return 结束方法，返回一个结果！
    public String sayHello(){
        return "hello,world";
    }
    public String print(){
        return "hello,world";
    }
    public int max(int a,int b){
        return a>b ? a : b; //三元运算符！
    }

    //数值下标越界: Arrayindexoutofbounds
    public void readFile(String file) throws IOException{

    }
}
