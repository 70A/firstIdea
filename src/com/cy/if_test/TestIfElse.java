package com.cy.if_test;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class TestIfElse {

    public static  void main(String[]args) {
        int i=5;
        if(i>3){
            System.out.println("5>3");
        }
        if(i>4){
            System.out.println("5>4");
        }
        if(i>5){
            System.out.println("5>5");
        }


        if(i>4){
            System.out.println("i>4");
            System.out.println("从第一个开始匹配，匹配到则下面的else if不再执行");
        }else if(i>2){
            System.out.println("i>2");
        }else if(i>5){
            System.out.println("i>5");
        }
    }

}
