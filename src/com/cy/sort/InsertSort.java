package com.cy.sort;

/**
 * Created by Tyki bom on 2018/8/27.
 */
public class InsertSort {

    public static void main(String[] args){
        int arr[] = {1, 5, 3, 6, 4, 11, 7, 2, 17};
        insertSort(arr);
        System.out.println("选择排序后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }else {
            for (int i=1;i<arr.length;i++){
                for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
