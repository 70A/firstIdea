package com.cy.if_test;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class TestContinue {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            if (i%2==0){
              System.out.println("continue后的语句不再执行，直接跳转到i++");
                continue;
              //continue后面不能再写东西,跳出本次循环，直接对i进行改变，进行下一次循环操作

            }
            System.out.println(i);
            break;//结束循环
        }
        System.out.println("==============测试2================");
        /**
         * 打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
         */
        int count = 0 ;
        for(int i=1;i<=100;i++){

            if(i%3==0 || i%5==0){
                continue;
            }
            System.out.print(i+" ");
            count++;
            if(count%5==0){
                System.out.println();
            }
        }

        System.out.println("====测试3====");
        for (int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("2");
            }else {
                 System.out.println("mmmm");
            }
        }
    }
}
