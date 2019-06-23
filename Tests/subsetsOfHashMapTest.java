import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class subsetsOfHashMapTest {

    @Test
    public void testSubsetOfHashMapWithTwoEntries() {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> subset1 = new HashMap<>();
        Map<String, Integer> subset2 = new HashMap<>();
        Map<String, Integer> subset3 = new HashMap<>();
        Map<String, Integer> subset4 = new HashMap<>();
        List<Map<String, Integer>> testSubsets = new ArrayList<>();

        map.put("first", 1);
        map.put("second", 2);

        List<Map<String, Integer>> subsets = subsetsOfHashMap.powerSet(map);

        subset1.put("first", 1);
        subset2.put("second", 2);
        subset3.put("first", 1);
        subset3.put("second",2);

        testSubsets.add(subset1);
        testSubsets.add(subset2);
        testSubsets.add(subset3);
        testSubsets.add(subset4);

        assertTrue(testSubsets.size() == subsets.size() && testSubsets.containsAll(subsets) && subsets.containsAll(testSubsets));
    }
}