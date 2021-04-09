package com.github.weiranyi;

import com.github.weiranyi.SelectionSort.ArrayGenerator;
import com.github.weiranyi.SelectionSort.SelectionSort;
import com.github.weiranyi.SelectionSort.SortingHelper;
import com.github.weiranyi.SelectionSort.Student;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
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
