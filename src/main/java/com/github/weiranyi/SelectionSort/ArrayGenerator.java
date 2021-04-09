package com.github.weiranyi.SelectionSort;

import java.util.Random;

/**
 * @author: https://github.com/weiranyi
 * @description ArrayGenerator
 * @date: 2021/4/9 9:19 下午
 * @Version 1.0
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        // 开辟用户制定的数组个数
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // 生成一个随机数组[0,max)
    public static Integer[] generateRandomArray(int n, int max) {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            // 最大值，达到max
            arr[i] = random.nextInt(max);
        }
        return arr;
    }
}

