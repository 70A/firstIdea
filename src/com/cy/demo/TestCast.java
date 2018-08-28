package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/28.
 * 数据类型之间的转换
 */
public class TestCast {

    public static void main(String[] args) {
        short s1 = 10;
        int i3 = 20;
        int i1 = s1;
        System.out.println("short类型的值直接赋给int类型：" + i1);

        short s2 = (short) i3;
        System.out.println("int类型转换为short类型，高类型转换为低类型，需要显示声明强转：" + s2);

        short s3 = (short) (s1 + s2);
        System.out.println("short类型在进行运算时，会自动转成int类型的数据");

        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;

        System.out.println(j);

        method1(6);
        method1(5);

        int i4 = 1;
        boolean b = !(i4++ == 3) ^ (i4++ ==2) && (i4++==3);
        System.out.println(b);
        System.out.println(i4);


        int i5 = 1;
        i5+=++i5;
        System.out.println(i5);

    }
        /**
         * 测试变量的作用域
         */

        public void method(int mm){
            System.out.println(mm);
         }

         public void method2(){
             System.out.println("不能访问method中的变量mm");
         }

    public static void method1(final int j) {
       // j = 5; //这个能否执行？
        System.out.println("j不能被赋值，在调用方法的时候就被赋值了，在本方法中不能再次赋值"+j);
    }

}
