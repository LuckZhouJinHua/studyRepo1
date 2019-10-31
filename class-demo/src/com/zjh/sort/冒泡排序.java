package com.zjh.sort;

import java.util.Arrays;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/9/23/023 21:05
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 6, 0, 3, 5, 1, 2, 4, 7};
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            System.out.println("第" + (i + 1) + "趟");
            //增加判断位
            boolean flag = true;
            for (int j = 0; j < len - 1 - i; j++) {
                System.out.println("第" + (j + 1) + "次");

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(arr));
            }
            //如果上面没有执行直接退出
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
