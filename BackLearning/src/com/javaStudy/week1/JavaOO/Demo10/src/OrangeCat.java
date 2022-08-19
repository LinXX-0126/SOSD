package com.javaStudy.week1.JavaOO.Demo10.src;

public class OrangeCat extends Cat {
    boolean isFat;
    double price = 200;

    //此处不是继承父类的构造 而是调用 *子类不能继承父类的构造方法，但是必须调用
    // *当父类是无参函数时，子类调用默认构造
    // *当父类是有参函数时，子类不调用默认构造，此时子类必须自主调用父类的构造方法*
    public OrangeCat(String name, String color, int age, double price, boolean isFat) {
        super(name, color, age, price);
        this.isFat = isFat;
    }

    public void play(){
        System.out.println("橘猫在玩");
    }


}
