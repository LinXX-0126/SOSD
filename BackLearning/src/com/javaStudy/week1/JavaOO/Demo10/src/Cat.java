package com.javaStudy.week1.JavaOO.Demo10.src;

public abstract class Cat {
    String name;
    int age;
    String gender;
    double price;
    String color;

    public abstract void play();

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public Cat(String name, String color, int age, double price){
        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;
    }


}
