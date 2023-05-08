package day22_wrapperClasses;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {


        int[] array = new int[5];

        array[0] = 10;

        array[1] = 20;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(1,15);

        System.out.println(list);






    }
}
