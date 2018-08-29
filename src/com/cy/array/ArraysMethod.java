package com.cy.array;

import java.util.Arrays;

/**
 * Created by Tyki bom on 2018/8/30.
 */
public class ArraysMethod {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        //转换为字符串
        String str = Arrays.toString(b);
        System.out.println(str);

        /**
         * 排序 Arrays.sort()
         */
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));

    }
}
