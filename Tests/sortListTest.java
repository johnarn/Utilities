import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class sortListTest {

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
    public void testSortListOfIntegersUsingZeroLengthList(){
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

    @Test
    public void testSortListOfDoubleUsingNegativeValues(){
        List<Double> negativeList = new ArrayList<>();
        negativeList.add(-4.0);
        negativeList.add(-5.0);
        negativeList.add(-8.0);
        negativeList.add(-2.0);
        negativeList.add(-1.0);
        negativeList.add(-5.0);

        List<Double> expectedNegativeList = new ArrayList<>();
        expectedNegativeList.add(-8.0);
        expectedNegativeList.add(-5.0);
        expectedNegativeList.add(-5.0);
        expectedNegativeList.add(-4.0);
        expectedNegativeList.add(-2.0);
        expectedNegativeList.add(-1.0);

        negativeList =sortList.sortListOfDouble(negativeList);
        assertEquals(expectedNegativeList, negativeList);
    }


    @Test
    public void testSortListOfDoubleUsingPositiveValues(){
        List<Double> positiveList = new ArrayList<>();
        positiveList.add(4.0);
        positiveList.add(5.0);
        positiveList.add(8.0);
        positiveList.add(2.0);
        positiveList.add(1.0);
        positiveList.add(5.0);

        List<Double> expectedPositiveList = new ArrayList<>();
        expectedPositiveList.add(1.0);
        expectedPositiveList.add(2.0);
        expectedPositiveList.add(4.0);
        expectedPositiveList.add(5.0);
        expectedPositiveList.add(5.0);
        expectedPositiveList.add(8.0);

        positiveList =sortList.sortListOfDouble(positiveList);
        assertEquals(expectedPositiveList, positiveList);
    }

    @Test
    public void testSortListOfDoubleUsingNull(){
        List<Double> nullList = null;
        List<Double> expectednullList = null;
        nullList =sortList.sortListOfDouble(nullList);
        assertEquals(expectednullList, nullList);
    }

    @Test
    public void testSortListOfDoubleUsingZeroLengthList(){
        List<Double> zeroLengthList = new ArrayList<>();
        List<Double> expectedzeroLengthList = new ArrayList<>();
        zeroLengthList =sortList.sortListOfDouble(zeroLengthList);
        assertEquals(expectedzeroLengthList, zeroLengthList);
    }


    @Test
    public void testSortListOfDoubleUsingAllRangeOfValues(){
        List<Double> mixValuesList = new ArrayList<>();
        mixValuesList.add(-4.0);
        mixValuesList.add(5.0);
        mixValuesList.add(8.0);
        mixValuesList.add(-2.0);
        mixValuesList.add(1.0);
        mixValuesList.add(0.0);

        List<Double> expectedMixValuesList = new ArrayList<>();
        expectedMixValuesList.add(-4.0);
        expectedMixValuesList.add(-2.0);
        expectedMixValuesList.add(0.0);
        expectedMixValuesList.add(1.0);
        expectedMixValuesList.add(5.0);
        expectedMixValuesList.add(8.0);

        mixValuesList =sortList.sortListOfDouble(mixValuesList);
        assertEquals(expectedMixValuesList, mixValuesList);
    }


    @Test
    public void testSortListOfFloatUsingNegativeValues(){
        List<Float> negativeList = new ArrayList<>();
        negativeList.add(-4.0F);
        negativeList.add(-5.0F);
        negativeList.add(-8.0F);
        negativeList.add(-2.0F);
        negativeList.add(-1.0F);
        negativeList.add(-5.0F);

        List<Float> expectedNegativeList = new ArrayList<>();
        expectedNegativeList.add(-8.0F);
        expectedNegativeList.add(-5.0F);
        expectedNegativeList.add(-5.0F);
        expectedNegativeList.add(-4.0F);
        expectedNegativeList.add(-2.0F);
        expectedNegativeList.add(-1.0F);

        negativeList =sortList.sortListOfFloat(negativeList);
        assertEquals(expectedNegativeList, negativeList);
    }


    @Test
    public void testSortListOfFloatUsingPositiveValues(){
        List<Float> positiveList = new ArrayList<>();
        positiveList.add(4.0F);
        positiveList.add(5.0F);
        positiveList.add(8.0F);
        positiveList.add(2.0F);
        positiveList.add(1.0F);
        positiveList.add(5.0F);

        List<Float> expectedPositiveList = new ArrayList<>();
        expectedPositiveList.add(1.0F);
        expectedPositiveList.add(2.0F);
        expectedPositiveList.add(4.0F);
        expectedPositiveList.add(5.0F);
        expectedPositiveList.add(5.0F);
        expectedPositiveList.add(8.0F);

        positiveList =sortList.sortListOfFloat(positiveList);
        assertEquals(expectedPositiveList, positiveList);
    }

    @Test
    public void testSortListOfFloatUsingNull(){
        List<Float> nullList = null;
        List<Float> expectednullList = null;
        nullList =sortList.sortListOfFloat(nullList);
        assertEquals(expectednullList, nullList);
    }

    @Test
    public void testSortListOfFloatUsingZeroLengthList(){
        List<Float> zeroLengthList = new ArrayList<>();
        List<Float> expectedzeroLengthList = new ArrayList<>();
        zeroLengthList =sortList.sortListOfFloat(zeroLengthList);
        assertEquals(expectedzeroLengthList, zeroLengthList);
    }


    @Test
    public void testSortListOfFloatUsingAllRangeOfValues(){
        List<Float> mixValuesList = new ArrayList<>();
        mixValuesList.add(-4.0F);
        mixValuesList.add(5.0F);
        mixValuesList.add(8.0F);
        mixValuesList.add(-2.0F);
        mixValuesList.add(1.0F);
        mixValuesList.add(0.0F);

        List<Float> expectedMixValuesList = new ArrayList<>();
        expectedMixValuesList.add(-4.0F);
        expectedMixValuesList.add(-2.0F);
        expectedMixValuesList.add(0.0F);
        expectedMixValuesList.add(1.0F);
        expectedMixValuesList.add(5.0F);
        expectedMixValuesList.add(8.0F);

        mixValuesList =sortList.sortListOfFloat(mixValuesList);
        assertEquals(expectedMixValuesList, mixValuesList);
    }


    @Test
    public void testSortListOfStringsUsingNull(){
        List<String> nullValuesList = null;
        List<String> expectedNullValuesList = null;
        nullValuesList =sortList.sortListOfStrings(nullValuesList);
        assertEquals(expectedNullValuesList, nullValuesList);
    }

    @Test
    public void testSortListOfStringsUsingZeroLengthList(){
        List<String> zeroLengthList = new ArrayList<>();
        List<String> expectedZeroLengthList = new ArrayList<>();
        zeroLengthList =sortList.sortListOfStrings(zeroLengthList);
        assertEquals(expectedZeroLengthList, zeroLengthList);
    }

    @Test
    public void testSortListOfStringsUsingValues(){
        List<String> valuesList = new ArrayList<>();
        valuesList.add("Morocco");
        valuesList.add("Greece");
        valuesList.add("USA");
        valuesList.add("Canada");

        List<String> expectedValuesList = new ArrayList<>();
        expectedValuesList.add("Canada");
        expectedValuesList.add("Greece");
        expectedValuesList.add("Morocco");
        expectedValuesList.add("USA");

        valuesList =sortList.sortListOfStrings(valuesList);
        assertEquals(expectedValuesList, valuesList);
    }

}