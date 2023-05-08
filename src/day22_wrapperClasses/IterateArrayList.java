package day22_wrapperClasses;

import java.util.ArrayList;

public class IterateArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        for (int i = 0; i < list.size(); i++) {

            int each = list.get(i);

            System.out.println(each);

        }





    }
}
