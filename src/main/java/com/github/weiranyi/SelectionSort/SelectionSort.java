package com.github.weiranyi.SelectionSort;

/**
 * @author: https://github.com/weiranyi
 * @description 选择排序算法
 * 循环不变量：arr[i...n)未排序 arr[0...i)已排序
 * 保持的方法：arr[i...n)中最小值要放到arr[i]的位置
 * @date: 2021/4/9 7:45 下午
 * @Version 1.0
 */
public class SelectionSort {
    private SelectionSort() {
    }

    // E extends Comparable<E> 中extends表示实现某一种接口
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 最小索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                // 通过Comparable接口进行比较
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
