package com.martin.helloworld;

/**
 * Created by Martin.Wang on 2017/6/29.
 */


public class HelloWorld {

    static String name = "Martin";//成员变量
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        //选择结构-if
        int score = 55;
        if (score >= 90){
            System.out.println("优");
        }
        else if (score >= 80 && score < 90){
            System.out.println("良");
        }
        else if (score >= 60 && score < 80){
            System.out.println("中");
        }
        else {
            System.out.println("差");
        }
        //选择结构-switch
        int today = 5;
        switch (today){
            case 6:
                System.out.println("周6");
                break;
            case 7:
                System.out.println("周7");
                break;
            default:
                System.out.println("工作日");
        }
        //循环结构-do-while,先做一遍再判断
        int count = 1;
        do{
            count++;
        }while (count <= 5);
        //循环结构-while,先判断
        while (count >= 1){
            count--;
        }
        //循环结构-for
        int sum = 0;
        for (int i = 1;i <= 5;i++){
            System.out.println(i);
            sum += i;
        }


    }


}
