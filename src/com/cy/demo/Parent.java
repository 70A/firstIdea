package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/27.
 */
public class Parent {
    int a;
    static String name;

    Parent(String name){

        this.name = name;
    }

    public void get(){
        System.out.println("父类方法name:"+name+",a="+a);
    }

    public  static  void get2(){
        System.out.println("父类静态的方法");
    }

    public void get3(){
        System.out.println("父类普通方法");
    }
}
