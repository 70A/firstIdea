package com.cy.array;

/**
 * Created by Tyki bom on 2018/8/30.
 */
public class UnionArray {
    public static void main(String[] args){
        int a[] = {1,5,3,1,6};
        int b[] = {11,35,35,11,64};
        int c[] = new int[10];
        for (int i=0;i<c.length;i++){
            if (i<a.length){
                c[i] = a[i];
            }else{
                c[i] = b[i-a.length];
            }
        }
        for (int each:c){
            System.out.print(each+" ");
        }
    }
}
