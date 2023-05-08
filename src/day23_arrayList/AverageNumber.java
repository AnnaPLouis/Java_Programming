package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();




        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);
        }

        int average = sum/ list.size();


        System.out.println(average);




    }


}
