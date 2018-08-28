package com.cy.cuoti;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class ChangeString {

    public static void  changeStr(String str){
        str = "welcome";
    }
    public static void main(String[] args){
        String str = "1234";
        changeStr(str);
        System.out.println(str);

        int x = 5;
        int m = 0;
        x+=x++ + (x++ +m);
        System.out.println("x="+x);

        byte b = -128;
        byte a = (byte)(b>>128);
        System.out.println("a="+a);

        int arr[] = {10,20,30,40,50,60,70};
        int s = 0;
        for (int i = 0;i<arr.length;i++)
            if (i%2==1)
                s+=arr[i];
        System.out.println(s);
    }
}
