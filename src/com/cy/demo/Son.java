package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/27.
 */
public class Son extends Parent{

    Son(){
        super(name);
        System.out.println("name:"+name+",a="+a);
    }

    public void get3(){
        System.out.println("子类重写后的方法");
    }

    public static void get2(){
        System.out.println("子类重写后的方法");
    }
}
