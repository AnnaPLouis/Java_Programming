package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");

        ArrayList<String> noDup = new ArrayList<>();

        for (String each : names) {

            if (noDup.contains(each)){
                continue;
            }
            noDup.add(each);

        }
        System.out.println(noDup);

    }
}
