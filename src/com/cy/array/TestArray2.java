package com.cy.array;

/**
 * Created by Tyki bom on 2018/8/30.
 */
public class TestArray2 {
    public static void main(String[] args){
        int arr[][] = new int[5][5];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        int max = 0;
        int p= 0;
        int q = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max = arr[i][j];
                    p = i;
                    q = j;
                }
            }
            System.out.println();
        }
        System.out.println("最大值为："+max+"坐标为："+p+","+q);
    }
}
