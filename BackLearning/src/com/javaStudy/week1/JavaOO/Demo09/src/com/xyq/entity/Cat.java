package com.javaStudy.week1.JavaOO.Demo09.src.com.xyq.entity;

public class Cat { //类默认继承object
    String name;
    String color;

    public Cat(String name,String color){
        this.name = name;
        this.color = color;
    }
    //子类对父类提供的方法不满意，重写


   // @Override
   // public String toString() {
      //  return "Cat{" +
        //        "name='" + name + '\'' +
          //      ", color='" + color + '\'' +
            //    '}';
    //}

    @Override
    public String toString() {
        return "我的猫是"+this.color+"颜色的"+this.name;
    }

    public static void main(String[] args) {
        Cat c = new Cat("xx","白");

        //直接打印这个c
        System.out.println(c);
        //默认打印对象，自动执行这个对象中的toString()方法
        System.out.println(c.toString());
        //上下相同
        //默认的toString（）-> 包+类@内存地址
        //加包之后就变了
    }
}
