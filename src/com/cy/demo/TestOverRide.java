package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/27.
 */
public class TestOverRide {

    public static void main(String[] args){
        Son son = new Son();
        son.get();//调用父类的方法
        son.a=1;
        son.name="zhangsan";
        son.get3();
        son.get2();

        switch ('A'){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
        }

    }
}
