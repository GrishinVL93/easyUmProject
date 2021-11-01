package lesson13.homework;


import java.util.*;

public class Homework implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

            for(String s: strings){
                if(s == null){
                    throw new IllegalArgumentException("element == null");
                }
            }

        return new ArrayList<>(Arrays.asList(strings));
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {

        if(data == null){
            throw new IllegalArgumentException("data == null");
        }

        List<Double> sortedList = new ArrayList<>(data);

        sortedList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o2, o1);
            }
        });

        return sortedList;
    }
}
