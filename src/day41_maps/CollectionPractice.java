package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5));

        List <Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,30,40,50));





        List<List<Integer>> lists = new ArrayList<>(); //list of list

        lists.addAll(Arrays.asList(list1,list2));

        System.out.println(lists);

        System.out.println(lists.get(1).get(3));

        for (List<Integer> eachlist : lists) {

            for (Integer eachElement : eachlist){
                System.out.println(eachElement);
            }

        }

        System.out.println("-----------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10,5,20));
        listOfSets.get(1).addAll(Arrays.asList(30,15,40));
        listOfSets.get(2).addAll(Arrays.asList(300,150,400));
        listOfSets.get(3).addAll(Arrays.asList(3000,5000,4000));

        System.out.println(listOfSets);

        System.out.println("---------------");

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        List<int[]> listOfArrays = new ArrayList<>();

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        listOfArrays.get(0)[2] = 35;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-----------------");










    }

}
