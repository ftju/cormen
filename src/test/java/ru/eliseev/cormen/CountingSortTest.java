package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.ArrayUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class CountingSortTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CountingSortTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HeapSortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int[] arry = {2, 6, 1, 0, 10,2};
        int[] sorted = CountingSort.sort(arry,10);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(0,1,2,2,6,10));

    }
}
