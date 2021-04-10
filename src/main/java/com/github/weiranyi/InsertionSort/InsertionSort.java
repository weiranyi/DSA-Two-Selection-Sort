package com.github.weiranyi.InsertionSort;

/**
 * @author: https://github.com/weiranyi
 * @description InsertionSort
 * @date: 2021/4/9 10:50 下午
 * @Version 1.0
 */
public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 将arr[i]插入到合适的位置
            // j-1要存在，j-1>0;将指针向前移，j--
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    // 优化后的插入排序法更快，少了寻址操作，但仅仅是常熟级的优化【不是算法的主要关注点】
    public static <E extends Comparable<E>> void sortOptimize(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 将arr[i]插入到合适的位置
            E temp = arr[i]; //暂存
            int j; // 指针
            for (j = i; j - 1 >= 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
