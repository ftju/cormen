package ru.eliseev.cormen;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class RadixSortTest {
    @Test
    public void testApp() {
        int[] arry = {2, 6, 1, 0, 10, 2};
        int[] sorted = RadixSort.sort(arry);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(0, 1, 2, 2, 6, 10));
    }
}
