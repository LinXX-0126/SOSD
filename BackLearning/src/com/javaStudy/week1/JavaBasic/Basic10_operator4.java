package com.javaStudy.week1.JavaBasic;

public class Basic10_operator4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b;//a=a+b
        a-=b;//a=a-b

        //字符串连接符   +
        System.out.println(a+b);
        System.out.println(""+a+b);
        System.out.println(a+b+"");
        System.out.println("=======================");

        //三元运算符
        // x?y:z
        // 格式： 变量1=要判断的条件 + “？” + 变量2 + “：” +变量3
        // 当条件为true 返回变量2，为false 返回变量3
        // 变量类型要统一
        int x1 = a>6? a:b;
        System.out.println(x1); //a=0 a>6为false 应当返回变量b 本行结果应为2
        System.out.println(b>a? b:a);//b>a为true 应当返回变量b 本行结果应为2
        //结果可证 推理正确

        double score = 80;
        String s = score>60? "考试通过":"挂科";
        System.out.println(s);
        System.out.println("=======================");


    //自增 自减案例练习
    // ++ -- 符号在前则先运算再将变量的新值投入计算式子中
    // 在后则先将变量原始值投入计算式子中,再计算，变量为新值但不替换计算式子中的值，但在下一次遇到该变量时，使用新值 规则相同
        int c = 10;
        int d = 5;
        int x = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(x);
        System.out.println(c);
        System.out.println(d);
    }
}
