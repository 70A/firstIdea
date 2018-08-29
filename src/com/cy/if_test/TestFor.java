package com.cy.if_test;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class TestFor {

    public static void main(String[] args){
        int sum = 0;

        for(int i=1;i<=10;i++){
            if(i==1){
                sum = i;
            }else {
                sum*=2;
            }
        }
        System.out.println("第10天乞丐的收入为："+sum);
    }
}
