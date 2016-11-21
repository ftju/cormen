package ru.eliseev.cormen;

import junit.framework.TestCase;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class QuickSortTest extends TestCase {
    @Test
    public void testApp() {
        int[] array = {2, 6, 1, 0, 10, 2};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(0, 1, 2, 2, 6, 10));

    }

    @Test
    public void testApp1() {
        int[] array = {2};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(2));

    }

    @Test
    public void testApp2() {
        int[] array = {3, 1};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(1, 3));

    }

    @Test
    public void testApp3() {
        int[] array = {3, 1, -7};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(-7, 1, 3));

    }
}
