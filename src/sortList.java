import java.util.ArrayList;
import java.util.List;

public class sortList {


    public static List<Integer> sortListOfIntegers(List<Integer> list) {
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        int temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<String> sortListOfStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        String temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<Double> sortListOfDouble(List<Double> list) {
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        Double temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<Float> sortListOfFloat(List<Float> list) {
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return new ArrayList<>();
        }
        float temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
