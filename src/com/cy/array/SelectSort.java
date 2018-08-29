package com.cy.array;

import java.util.Arrays;

/**
 * Created by Tyki bom on 2018/8/30.
 */
public class SelectSort {
    public static void main(String[] args){
        int arr[] = {18,62,68,82,65,9};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
        //for each
        int max1 = 0;
        for (int each:arr){
            max1= each>max1?each:max1;
            System.out.print(each+",");
        }
        System.out.println("最大值："+max1);
        /**
         * 找出数组中最大的数
         */
        int max = arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值："+max);
    }

    public static void sortArr(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            for (int j = i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
