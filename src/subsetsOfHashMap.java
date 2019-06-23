import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subsetsOfHashMap {
    public static List<Map<String, Integer>> powerSet(Map<String, Integer> hm){
        if(hm == null){
            return null;
        }

        List<Map<String,Integer>> subsets = new ArrayList<>();
        List<String> subListKeys = new ArrayList<>(hm.keySet());
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (int i = 0; i < subListKeys.size(); i++) {
            ArrayList<ArrayList<String>> temp = new ArrayList<>();

            for (ArrayList<String> a : result) {
                temp.add(new ArrayList<>(a));
            }

            for (ArrayList<String> a : temp) {
                a.add(subListKeys.get(i));
            }

            ArrayList<String> single = new ArrayList<>();
            single.add(subListKeys.get(i));
            temp.add(single);

            result.addAll(temp);
        }

        //add empty set
        result.add(new ArrayList<>());

        for(int i=0; i<result.size(); i++){

            Map<String, Integer> sub = new HashMap<>();
            for(int j=0; j<result.get(i).size(); j++){
                sub.put(result.get(i).get(j), hm.get(result.get(i).get(j)));
            }
            subsets.add(sub);
        }
        return subsets;
    }
}
