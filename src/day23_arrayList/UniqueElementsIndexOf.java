package day23_arrayList;

import java.util.ArrayList;

public class UniqueElementsIndexOf {
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

        for (String each : names) {

            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }

        }



    }
}
