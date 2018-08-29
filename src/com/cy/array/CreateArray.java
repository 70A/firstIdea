package com.cy.array;

/**
 * Created by Tyki bom on 2018/8/29.
 */
public class CreateArray {
    public static void main(String[] args) {

        int a1[];//声明一个数组变量，不会创建数组
        a1 = new int[5];//创建数组，指明数组的长度
        int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值

        /**
         * 分配空间与赋值分步进行
         */
        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
        System.out.println(a[0]);

        //进行赋值

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;

        /**
         * 分配空间，同时赋值
         */
        //写法一： 分配空间同时赋值
        int[] a2 = new int[]{100,102,444,836,3236};

        //写法二： 省略了new int[],效果一样
        int[] b = {100,102,444,836,3236};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
      //  int[] c = new int[3]{100,102,444};


        int[] arr = new int[5];
        arr[0] = (int) (Math.random() * 100);
        arr[1] = (int) (Math.random() * 100);
        arr[2] = (int) (Math.random() * 100);
        arr[3] = (int) (Math.random() * 100);
        arr[4] = (int) (Math.random() * 100);
        System.out.println("原数组为：");
        for(int i = 0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("反转后的数组为：");
        reserveArray(arr);
        for(int i =0;i<=4;i++){
            System.out.print(arr[i]+" ");

        }
    }


    public static  void reserveArray(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
