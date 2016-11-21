package ru.eliseev.cormen;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class CountingSortTest {
    @Test
    public void testApp() {
        int[] arry = {2, 6, 1, 0, 10, 2};
        int[] sorted = CountingSort.sort(arry, 10);
        assertThat(ArrayUtils.toObject(sorted), arrayContaining(0, 1, 2, 2, 6, 10));

    }
}
