package com.javaStudy.week1.JavaOO.demo02;

//java ---> class
public class Person {

    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器
    String name;
    int age;


    //alt+ insert


    //1.使用new关键字，本质是调用构造器
    //2.用来初始化值
    public Person(){

    }
    //有参构造:一旦定义了有参构造，无参就必须显示定义
    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}

/*
   public static void main(String[] args){
   //new实例化了一个对象
   Person person = new Person("kuangshen",23);

   System,out.println(person.name);

   }


   构造器：
       1.和类名相同
       2.没有返回值
   作用：
       1.new 本质在调用构造方法
       2.初始化对象的值
   注意点：
       1.定义有参构造之后，如果想使用无参构造，显示的定义一个无参的构造

   Alt + Insert

   this. =
 */