package com.cy.if_test;

import java.util.Scanner;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class TestSwitch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        if(month>=1 && month <=12){
            switch (month){
                case 12:
                case 1:
                case 2:
                    System.out.println("冬天");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("春天");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏天");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋天");
                    break;
                default:
                    System.out.println("switch语句表达式可以是byte、short、int、char、string、enum");

            }
        }else {
            System.out.println("请输入正确的月份");
        }
    }
}
