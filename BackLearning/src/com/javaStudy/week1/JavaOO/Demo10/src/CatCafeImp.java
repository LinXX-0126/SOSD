package com.javaStudy.week1.JavaOO.Demo10.src;

public class CatCafeImp implements CatCafe{
    double balance;
    char ArrayList;

    public CatCafeImp(double balance,char ArrayList){
        this.balance = balance;
        this.ArrayList = ArrayList;
    }

    public static void main(String[] args) {
        CatCafeImp CC1 = new CatCafeImp(600,'p');
    }


    @Override
    public void buy(Cat c) {



    }

    @Override
    public void zhaodai(Customer p) {

    }

    @Override
    public void close() {

    }
}
