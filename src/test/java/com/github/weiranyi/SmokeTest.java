package com.github.weiranyi;

import com.github.weiranyi.SelectionSort.SelectionSort;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        Integer[] arr = {8, 6, 7, 3, 8191, 9};
        SelectionSort.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
