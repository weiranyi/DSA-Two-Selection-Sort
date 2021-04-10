package com.github.weiranyi.SelectionSort;

import com.github.weiranyi.InsertionSort.InsertionSort;

/**
 * @author: https://github.com/weiranyi
 * @description 检查排序结果是否正常
 * @date: 2021/4/9 9:31 下午
 * @Version 1.0
 */
public class SortingHelper {
    private SortingHelper() {
    }

    // 判断数组是否有序
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                // 数组不是有序的
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) {
        long startTime = System.nanoTime();
        // 可以用反射机制
        if (sortname.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        } else if (sortname.equals("InsertionSort")) {
            InsertionSort.sort(arr);
        } else if (sortname.equals("InsertionSortOptimize")) {
            InsertionSort.sortOptimize(arr);
        }
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(sortname + " failed");
        }
        System.out.println(String.format("%s , n = %d : %f s", sortname, arr.length, time));
    }

}
