package ru.eliseev.cormen;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testApp() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(BinarySearch.find(a, 1));
        System.out.println(BinarySearch.find(a, 5));
        System.out.println(BinarySearch.find(a, 3));
        System.out.println(BinarySearch.find(a, -1));
        System.out.println(BinarySearch.find(a, 30));
        System.out.println(BinarySearch.find(a, 10));
    }
}
