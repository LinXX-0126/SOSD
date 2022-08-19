package com.javaStudy.week1.JavaProcessControl;

public class ProC11_ForLoop {
    public static void main(String[] args) {
        int a = 1;//初始化

        while (a<=100){//条件判断
            System.out.println(a); //循环体
            a+=2; //迭代
        }
        System.out.println("While loop is over.");

        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("For loop is over.");

        for (;;){

        }
    }

    /*
    最先执行初始化步骤.  可以声明一种类型，也可初始化一个或多个循环控制变量，也可以是空语句
    再检测布尔表达式的值.如果为true，循环体被执行，反之循环终止，开始执行循环体后面的语句
    再次检测布尔表达式， 循环执行上面的过程
     */
}
