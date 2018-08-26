package com.cy.demo;

/**
 * Created by Tyki bom on 2018/8/26.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 6, 4, 11, 7, 2, 17};
        selectionSort(arr);
        System.out.println("插入排序后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int[] arr){
        if (arr == null||arr.length<2){
            return;
        }else {
            for (int i=0;i<arr.length;i++){
                int minIndex = i;
                for(int j=i+1;j<arr.length;j++){
                    minIndex = arr[j]<arr[minIndex]?j:minIndex;
                }
                swap(arr,i,minIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
