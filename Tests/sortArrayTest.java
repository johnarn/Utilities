import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class sortArrayTest {

    @Test
    public void testSortListOfIntegersUsingNegativeValues(){
        List<Integer> negativeList = new ArrayList<>();
        negativeList.add(-4);
        negativeList.add(-5);
        negativeList.add(-8);
        negativeList.add(-2);
        negativeList.add(-1);
        negativeList.add(-5);

        List<Integer> expectedNegativeList = new ArrayList<>();
        expectedNegativeList.add(-8);
        expectedNegativeList.add(-5);
        expectedNegativeList.add(-5);
        expectedNegativeList.add(-4);
        expectedNegativeList.add(-2);
        expectedNegativeList.add(-1);

        negativeList =sortList.sortListOfIntegers(negativeList);
        assertEquals(expectedNegativeList, negativeList);
    }


    @Test
    public void testSortListOfIntegersUsingPositiveValues(){
        List<Integer> positiveList = new ArrayList<>();
        positiveList.add(4);
        positiveList.add(5);
        positiveList.add(8);
        positiveList.add(2);
        positiveList.add(1);
        positiveList.add(5);

        List<Integer> expectedPositiveList = new ArrayList<>();
        expectedPositiveList.add(1);
        expectedPositiveList.add(2);
        expectedPositiveList.add(4);
        expectedPositiveList.add(5);
        expectedPositiveList.add(5);
        expectedPositiveList.add(8);

        positiveList =sortList.sortListOfIntegers(positiveList);
        assertEquals(expectedPositiveList, positiveList);
    }

    @Test
    public void testSortListOfIntegersUsingNull(){
        List<Integer> nullList = null;
        List<Integer> expectednullList = null;
        nullList =sortList.sortListOfIntegers(nullList);
        assertEquals(expectednullList, nullList);
    }

    @Test
    public void testSortListOfIntegersUsingZeroLengthArray(){
        List<Integer> zeroLengthList = new ArrayList<>();
        List<Integer> expectedzeroLengthList = new ArrayList<>();
        zeroLengthList =sortList.sortListOfIntegers(zeroLengthList);
        assertEquals(expectedzeroLengthList, zeroLengthList);
    }


    @Test
    public void testSortListOfIntegersUsingAllRangeOfValues(){
        List<Integer> mixValuesList = new ArrayList<>();
        mixValuesList.add(-4);
        mixValuesList.add(5);
        mixValuesList.add(8);
        mixValuesList.add(-2);
        mixValuesList.add(1);
        mixValuesList.add(0);

        List<Integer> expectedMixValuesList = new ArrayList<>();
        expectedMixValuesList.add(-4);
        expectedMixValuesList.add(-2);
        expectedMixValuesList.add(0);
        expectedMixValuesList.add(1);
        expectedMixValuesList.add(5);
        expectedMixValuesList.add(8);

        mixValuesList =sortList.sortListOfIntegers(mixValuesList);
        assertEquals(expectedMixValuesList, mixValuesList);
    }
}