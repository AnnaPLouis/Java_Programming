package day39_collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 200, 300,40, 90));
        set1.addAll(Arrays.asList(10, 200, 300,40, 90));
        set1.addAll(Arrays.asList(10, 200, 300,40, 90));
        set1.addAll(Arrays.asList(10, 200, 300,40, 90));

        System.out.println(set1);


        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();



        String [] words = {"Java", "Java", "Java", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);

        for (String each : result) {

            System.out.println(each);

        }
    }
}
