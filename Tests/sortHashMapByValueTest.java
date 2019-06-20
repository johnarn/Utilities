import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.*;

import static org.junit.Assert.*;

public class sortHashMapByValueTest {

    @Test
    public void testSortByValueWithStringAsKeyAndPositiveDoubleAsValue() {
        Map<String, Double> hashmap = new HashMap<>();
        hashmap.put("first", 10.0);
        hashmap.put("third", 25.0);
        hashmap.put("second", 14.0);
        hashmap.put("fifth", 50.0);
        hashmap.put("fourth", 35.0);

        Map<String, Double> sortedHashMap = new LinkedHashMap<>();
        sortedHashMap.put("first", 10.0);
        sortedHashMap.put("second", 14.0);
        sortedHashMap.put("third", 25.0);
        sortedHashMap.put("fourth", 35.0);
        sortedHashMap.put("fifth", 50.0);

        Map<String, Double> newSortedHashmap = sortHashMapByValue.sortByValue(hashmap);

        List newsortedkeys = new ArrayList(newSortedHashmap.keySet());
        List sortedkeys = new ArrayList(sortedHashMap.keySet());

        for(int i=0; i<sortedkeys.size(); i++){
            assertEquals(newsortedkeys.get(i), sortedkeys.get(i));
        }

    }

    @Test
    public void testSortByValueWithStringAsKeyAndNegativeDoubleAsValue() {
        Map<String, Double> hashmap = new HashMap<>();

        hashmap.put("first", -10.0);
        hashmap.put("third", -25.0);
        hashmap.put("second", -14.0);
        hashmap.put("fifth", -50.0);
        hashmap.put("fourth", -35.0);

        Map<String, Double> sortedHashMap = new LinkedHashMap<>();
        sortedHashMap.put("fifth", -50.0);
        sortedHashMap.put("fourth", -35.0);
        sortedHashMap.put("third", -25.0);
        sortedHashMap.put("second", -14.0);
        sortedHashMap.put("first", -10.0);



        Map<String, Double> newSortedHashmap = sortHashMapByValue.sortByValue(hashmap);



        List newsortedkeys = new ArrayList(newSortedHashmap.keySet());
        List sortedkeys = new ArrayList(sortedHashMap.keySet());

        for(int i=0; i<sortedkeys.size(); i++){
            assertEquals(newsortedkeys.get(i), sortedkeys.get(i));
        }
    }

    @Test
    public void testSortByValueWithNullHashMap() {
        Map<String, Double> newSortedHashmap = sortHashMapByValue.sortByValue(null);
        Map<String, Double> emptyHashMap = new HashMap<>();
        assertEquals(emptyHashMap, newSortedHashmap);
    }


}