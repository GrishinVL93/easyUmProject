package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTimeArrAdd = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            arrayList.add(i,"ksds" + i);
        }

        long endTimeArrAdd = System.currentTimeMillis();

        System.out.println("End: " + (endTimeArrAdd - startTimeArrAdd));


        long startTimeLinkStart = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i,"kkkk" + i);
        }

        long endTimeLinkEnd = System.currentTimeMillis();

        System.out.println("End: " + (endTimeLinkEnd - startTimeLinkStart));


        long startTimeArrGet = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            arrayList.get(i);
        }

        long endTimeArrGet = System.currentTimeMillis();

        System.out.println("End: " + (endTimeArrGet - startTimeArrGet));


        long startTimeLinkStartGet = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            linkedList.get(i);
        }

        long endTimeLinkEndGet = System.currentTimeMillis();

        System.out.println("End: " + (endTimeLinkEndGet - startTimeLinkStartGet));
    }
}
