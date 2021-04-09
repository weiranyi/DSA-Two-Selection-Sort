package com.github.weiranyi;

import com.github.weiranyi.SelectionSort.ArrayGenerator;
import com.github.weiranyi.SelectionSort.SelectionSort;
import com.github.weiranyi.SelectionSort.SortingHelper;
import com.github.weiranyi.SelectionSort.Student;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        int n = 10000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        long startTime = System.nanoTime();
        SelectionSort.sort(arr);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException("选择排序算法失败！！！");
        }
        System.out.println("对于" + n + "个数据" + ",耗时：" + time + "s" + ";");


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
