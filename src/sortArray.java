import java.util.ArrayList;
import java.util.List;

public class sortArray {


    public static List<Integer> sortArrayOfIntegers(List<Integer> array){
        if (array == null) {
            return null;
        }
        if(array.size() == 0){
            return new ArrayList<>();
        }
        int temp;
        for(int i=0; i<array.size()-1; i++){
            for(int j=i+1; j<array.size(); j++){
                if(array.get(i).compareTo(array.get(j)) > 0){
                    temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }
        return array;
    }
}
