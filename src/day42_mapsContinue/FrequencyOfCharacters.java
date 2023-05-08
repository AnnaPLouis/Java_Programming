package day42_mapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

       for (String each : str.split("")) { //String to array
           int frequency = Collections.frequency(Arrays.asList(str.split("")), each); //array to arraylist
           map.put(each.charAt(0), frequency);
       }

        System.out.println(map);
    }
}
