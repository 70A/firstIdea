package com.cy.if_test;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class TestIf {

    public static void main(String[] args){
        boolean b = false;
        if(b){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        if (b);
        System.out.println(";是一个语句");
    }
}
