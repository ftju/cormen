package ru.eliseev.cormen;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InsertionSortTest {
    @Test
    public void testApp() {
        List<Integer> integers = Arrays.asList(2, 6, 1, 0, 10);
        InsertionSort.sort(integers);
        System.out.println(integers);
    }
}
