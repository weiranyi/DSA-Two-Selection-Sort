package com.github.weiranyi;

import com.github.weiranyi.SelectionSort.ArrayGenerator;
import com.github.weiranyi.SelectionSort.SelectionSort;
import com.github.weiranyi.SelectionSort.SortingHelper;
import com.github.weiranyi.SelectionSort.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SmokeTest {
    @Test
    public void test() {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            System.out.println("随机数组：");
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            // 拷贝数组
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSortOptimize", arr2);

            System.out.println("有序数组：");
            arr = ArrayGenerator.generateOrderedArray(n);
            // 拷贝数组
            arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSortOptimize", arr2);

            //SortingHelper.sortTest("InsertionSort", arr2);
        }


        Student[] students = {new Student("亦蔚然1", 95),
                new Student("亦蔚然2", 90),
                new Student("亦蔚然3", 100)};
        SelectionSort.sort(students);
        for (Student student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
