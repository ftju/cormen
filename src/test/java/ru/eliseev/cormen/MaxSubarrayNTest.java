package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sergey on 28.08.16.
 */
public class MaxSubarrayNTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MaxSubarrayNTest(String testName )
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
        MaxSubarrayN.SumIndexed sumIndexed = MaxSubarrayN.find(new long[]{
                13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7
        });
        assertEquals(new MaxSubarrayN.SumIndexed(43,7,10),sumIndexed);

    }
}
