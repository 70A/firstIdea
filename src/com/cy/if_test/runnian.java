package com.cy.if_test;

import java.util.Scanner;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class runnian {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = scanner.nextInt();
        //判断是不是闰年
        if(year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
