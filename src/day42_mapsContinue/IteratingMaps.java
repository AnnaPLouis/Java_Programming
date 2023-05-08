package day42_mapsContinue;

import java.util.HashMap;
import java.util.Map;

import java.util.LinkedHashMap;

public class IteratingMaps {

    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("Daniel", 95000);
        map.put("Bella", 100000);
        map.put("Emily", 85000);
        map.put("Aaron", 100500);
        map.put("Jimmy", 100900);
        map.put("Breanna", 108500);

        //Iterating by keys

        for (String eachKey : map.keySet()) {

            System.out.println(eachKey);

            map.replace(eachKey, map.get(eachKey) * 2);

            
        }

        System.out.println(map);

        System.out.println("-------------------");

        // Iterating by values

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);

        }

        System.out.println("--------------------");

        // Iterating by entry

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            eachEntry.setValue(eachValue + 10000);

        }

        System.out.println(map);









    }

}
