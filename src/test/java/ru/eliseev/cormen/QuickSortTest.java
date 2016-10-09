package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.ArrayUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class QuickSortTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public QuickSortTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( QuickSortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int[] array = {2, 6, 1, 0, 10,2};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(0,1,2,2,6,10));

    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        int[] array = {2};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(2));

    }

    /**
     * Rigourous Test :-)
     */
    public void testApp2()
    {
        int[] array = {3,1};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(1,3));

    }

    /**
     * Rigourous Test :-)
     */
    public void testApp3()
    {
        int[] array = {3,1,-7};
        int[] sorted = QuickSort.sort(array);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(-7,1,3));

    }
}
