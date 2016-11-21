package ru.eliseev.cormen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubarrayNTest {
    @Test
    public void testApp() {
        MaxSubarrayN.SumIndexed sumIndexed = MaxSubarrayN.find(new long[]{
                13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7
        });
        assertEquals(new MaxSubarrayN.SumIndexed(43, 7, 10), sumIndexed);

    }
}
