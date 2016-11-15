package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SelectNTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SelectNTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SelectNTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 3);
        assertThat(i, is(2));
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 0);
        assertThat(i, is(0));
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp2() {
        int[] a = {2, 6, 1, 0, 10, 2};
        int i = SelectN.selectN(a, 0, a.length - 1, 5);
        assertThat(i, is(10));
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp3() {
        int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int i = SelectN.selectN(a, 0, a.length - 1, 5);
        assertThat(i, is(1));
    }
}
