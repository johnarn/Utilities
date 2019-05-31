import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class sortArrayTest {

    @Test
    public void testSortArrayOfIntegersUsingNegativeValues(){
        List<Integer> negativeArray = new ArrayList<>();
        negativeArray.add(-4);
        negativeArray.add(-5);
        negativeArray.add(-8);
        negativeArray.add(-2);
        negativeArray.add(-1);
        negativeArray.add(-5);

        List<Integer> expectedNegativeArray = new ArrayList<>();
        expectedNegativeArray.add(-8);
        expectedNegativeArray.add(-5);
        expectedNegativeArray.add(-5);
        expectedNegativeArray.add(-4);
        expectedNegativeArray.add(-2);
        expectedNegativeArray.add(-1);

        negativeArray =sortArray.sortArrayOfIntegers(negativeArray);
        assertEquals(expectedNegativeArray, negativeArray);
    }


    @Test
    public void testSortArrayOfIntegersUsingPositiveValues(){
        List<Integer> positiveArray = new ArrayList<>();
        positiveArray.add(4);
        positiveArray.add(5);
        positiveArray.add(8);
        positiveArray.add(2);
        positiveArray.add(1);
        positiveArray.add(5);

        List<Integer> expectedPositiveArray = new ArrayList<>();
        expectedPositiveArray.add(1);
        expectedPositiveArray.add(2);
        expectedPositiveArray.add(4);
        expectedPositiveArray.add(5);
        expectedPositiveArray.add(5);
        expectedPositiveArray.add(8);

        positiveArray =sortArray.sortArrayOfIntegers(positiveArray);
        assertEquals(expectedPositiveArray, positiveArray);
    }

    @Test
    public void testSortArrayOfIntegersUsingNull(){
        List<Integer> nullArray = null;
        List<Integer> expectednullArray = null;
        nullArray =sortArray.sortArrayOfIntegers(nullArray);
        assertEquals(expectednullArray, nullArray);
    }

    @Test
    public void testSortArrayOfIntegersUsingZeroLengthArray(){
        List<Integer> zeroLengthArray = new ArrayList<>();
        List<Integer> expectedzeroLengthArray = new ArrayList<>();
        zeroLengthArray =sortArray.sortArrayOfIntegers(zeroLengthArray);
        assertEquals(expectedzeroLengthArray, zeroLengthArray);
    }


    @Test
    public void testSortArrayOfIntegersUsingAllRangeOfValues(){
        List<Integer> mixValuesArray = new ArrayList<>();
        mixValuesArray.add(-4);
        mixValuesArray.add(5);
        mixValuesArray.add(8);
        mixValuesArray.add(-2);
        mixValuesArray.add(1);
        mixValuesArray.add(0);

        List<Integer> expectedMixValuesArray = new ArrayList<>();
        expectedMixValuesArray.add(-4);
        expectedMixValuesArray.add(-2);
        expectedMixValuesArray.add(0);
        expectedMixValuesArray.add(1);
        expectedMixValuesArray.add(5);
        expectedMixValuesArray.add(8);

        mixValuesArray =sortArray.sortArrayOfIntegers(mixValuesArray);
        assertEquals(expectedMixValuesArray, mixValuesArray);
    }
}