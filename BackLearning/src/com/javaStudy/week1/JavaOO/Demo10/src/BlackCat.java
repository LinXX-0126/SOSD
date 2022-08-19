package com.javaStudy.week1.JavaOO.Demo10.src;

public class BlackCat extends Cat {
    double price = 350;

    public BlackCat(String name, String color, int age, double price, double price1) {
        super(name, color, age, price);
        this.price = price1;
    }

    public void play(){
        System.out.println("黑猫在玩");
    }
    public static void main(String[] args) {


    }
}
