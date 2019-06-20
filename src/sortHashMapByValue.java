import java.util.*;

public class sortHashMapByValue {



    public static HashMap<String, Double> sortByValue(Map<String, Double> hm){

        if(hm == null){
            return new HashMap<>();
        }
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double> > list = new LinkedList(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Double> >() {
            public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2){
                return (entry1.getValue()).compareTo(entry2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap();
        for (Map.Entry<String, Double> item : list) {
            temp.put(item.getKey(), item.getValue());
        }
        return temp;
    }

}
