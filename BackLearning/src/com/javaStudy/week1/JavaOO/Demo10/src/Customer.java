package com.javaStudy.week1.JavaOO.Demo10.src;

import java.time.LocalDate;

public class Customer {
    String name;
    int times;
    LocalDate arrival;

    public Customer(String name,int times){
        this.name = name;
        this.times = times;
    }

    public void buy(Cat c){
        System.out.println(this.name+"买了一只"+c.name);
    }
    public void rua(Cat c){
        System.out.println(this.name+"rua");
    }

    @Override
    public String toString() {
        return "客户"+this.name+"在"+this.arrival+"到店，想要rua猫"+this.times+"次。";
    }

    public static void main(String[] args) {
        Customer p = new Customer("林林",5);
        System.out.println(p);
    }
}
