package com.javaStudy.week1.JavaMethod;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1);
        printMax(34,5,9,88,56.5);
        printMax(new double[]{1,2,3});

    }

    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed.");
            return;
        }

        double result = numbers[0];

        //求最大
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("The max value is "+result);
    }

    public void test(int... i ){
        System.out.println(i);
        System.out.println("================");
    }
}
