package com.javaStudy.week1.JavaArray;

public class Demo01 {
    //变量类型  变量名 =   变量值;
    //数组类型
    public static void main(String[] args) {
        int[] nums;//定义 1.声明一个数组
//        int nums2[];
        nums = new int[10];//2.创建一个数组
        //这里面可以存放10个int类型的数字
        //3.给数组元素赋值
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums[9]=10;
        System.out.println(nums[0]);

        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
