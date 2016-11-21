package ru.eliseev.cormen;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SelectNTest {
    @Test
    public void testApp() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 3);
        assertThat(i, is(2));
    }

    @Test
    public void testApp1() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 0);
        assertThat(i, is(0));
    }

    @Test
    public void testApp2() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 5);
        assertThat(i, is(10));
    }

    @Test
    public void testApp3() {
        int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int i = SelectN.selectN(a, 0, a.length - 1, 5);
        assertThat(i, is(1));
    }
}
