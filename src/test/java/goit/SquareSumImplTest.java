package goit;

import junit.framework.Assert;
import org.junit.Test;

public class SquareSumImplTest {
    SquareSum example = new SquareSumImpl();


    @Test(expected = IllegalArgumentException.class )
    public void testGetSquareSumException() throws Exception {
        example.getSquareSum(new int[10], -5);
    }

    @Test
    public void testGetSquareSum() throws Exception {
        int[] mas = {1,2,3,4,5};
        int numberOfThreads = 5;
        long result = example.getSquareSum(mas, numberOfThreads);
        long expectedResult = 55;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testGetSquareSumWithEvenElements() throws Exception {
        int[] mas = {1,2,3,4};
        int numberOfThreads = 3;
        long result = example.getSquareSum(mas, numberOfThreads);
        long expectedResult = 30;
        Assert.assertEquals(expectedResult, result);
    }
}