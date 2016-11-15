package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.ArrayUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class RadixSortTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RadixSortTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RadixSortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int[] arry = {2, 6, 1, 0, 10,2};
        int[] sorted = RadixSort.sort(arry);
        assertThat(ArrayUtils.toObject(sorted) , arrayContaining(0,1,2,2,6,10));

    }
}
