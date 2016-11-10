package ru.eliseev.cormen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.ArrayUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class BinarySearchTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BinarySearchTest(String testName )
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

        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.find(a,1));
        System.out.println(BinarySearch.find(a,5));
        System.out.println(BinarySearch.find(a,3));
        System.out.println(BinarySearch.find(a,-1));
        System.out.println(BinarySearch.find(a,30));
        System.out.println(BinarySearch.find(a,10));



    }
}
