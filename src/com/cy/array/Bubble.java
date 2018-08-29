package com.cy.array;

import java.util.Arrays;

/**
 * Created by Tyki bom on 2018/8/30.
 */
public class Bubble {
    public static void main(String[] args){
        int arr[] = {18,62,68,82,65,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for(int end=arr.length-1;end>0;end--){
            for (int i=0;i<end;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
