package ru.eliseev.cormen;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static ru.eliseev.cormen.Compactify.NULL;

public class CompactifyTest {
    @Test
    public void testApp() {
        int[] next = {NULL, 4, NULL, NULL, 0, NULL};
        int[] key = {2, 6, 0, 0, 10, 0};
        int[] prev = {4, NULL, NULL, NULL, 1, NULL};
        Compactify.compactify(key, prev, next, 1);
        assertThat(ArrayUtils.toObject(next), arrayContaining(1, 2, NULL, NULL, NULL, NULL));
        assertThat(ArrayUtils.toObject(key), arrayContaining(6, 10, 2, 0, 0, 0));
        assertThat(ArrayUtils.toObject(prev), arrayContaining(NULL, 0, 1, NULL, NULL, NULL));
    }

}
