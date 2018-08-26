package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/26.
 */
public class BubbleSort {

    public static void main(String[] args){
        int arr[] = {1,5,3,6,4,11,7,2,17};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }else{
            for (int end=arr.length-1;end>0;end--){
                for (int i=0;i<end;i++){
                    if (arr[i]>arr[i+1]){
                        swap(arr,i,i+1);
                    }
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
