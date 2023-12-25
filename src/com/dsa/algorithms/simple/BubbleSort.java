package com.dsa.algorithms.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 19zfl
 * @description 冒泡排序
 * @date 2023/12/25
 */

public class BubbleSort {

    public static void main(String[] args) {

        // console中输入一组整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组的个数：");
        int sum = scanner.nextInt();
        // 声明一个数组
        int[] arr = new int[sum];
        System.out.println("请随机输入" + sum + "个整数：");
        for (int i = 0; i <= sum - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        // 排序前
        System.err.println(Arrays.toString(arr));
        // 开始排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // 排序后
        System.err.println(Arrays.toString(arr));
    }

}
