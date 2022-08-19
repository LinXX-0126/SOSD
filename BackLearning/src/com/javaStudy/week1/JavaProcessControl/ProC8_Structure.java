package com.javaStudy.week1.JavaProcessControl;

public class ProC8_Structure {
    //switch case语句
    public static void main(String[] args) {
        char grade = 'F';
        //case穿透    匹配一个值
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;//如果没有break，符合条件的case语句之后的语句也都会被输出
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }

        String name = "xxx";
        //反编译 java---class(字节码文件)---反编译(IDEA)
        switch (name){
            case "xx":
                System.out.println("xx");
                break;
            case "xxx":
                System.out.println("xxx");
                break;
            default:
                System.out.println("what are you doing?");
        }
    }


}
