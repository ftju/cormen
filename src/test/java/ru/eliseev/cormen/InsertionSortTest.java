package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class InsertionSortTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InsertionSortTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( InsertionSortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        List<Integer> integers = Arrays.asList(2, 6, 1, 0, 10);
        InsertionSort.sort(integers);
        System.out.println(integers);
    }
}
