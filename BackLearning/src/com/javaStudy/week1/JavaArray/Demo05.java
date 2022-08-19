package com.javaStudy.week1.JavaArray;

public class Demo05 {
    public static void main(String[] args) {
        //[4][2]
        /*
        1,2 array[0]
        2,3 array[1]
        3,4 array[2]
        4,5 array[3]
        5,6 array[4]
         */
        int[][] array = {{1,2},{2,3},{3,4},{4,5},{5,6}};

        printArray(array[0]);
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
