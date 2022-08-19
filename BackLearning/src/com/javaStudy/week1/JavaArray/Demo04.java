package com.javaStudy.week1.JavaArray;

public class Demo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//        printArray(arrays);
        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    //打印数组元素
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    //反转数组
    public static int[] reverse(int[] a){
        int[] result = new int[a.length];
//        for (int i = 0; i <a.length; i++) {
//            result[i]=a[a.length-i-1];
//        }
        for (int i = 0,j=result.length-1; i < a.length; i++,j--) {
            result[j] = a[i];
        }

        return result;
    }
}
