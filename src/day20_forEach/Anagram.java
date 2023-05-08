package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str1 = "heart";
        String str2 = "earth";

        char[] arr1 = str1.toLowerCase().toCharArray();

        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);

        Arrays.sort(arr2);


        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

        boolean isAnagram = (Arrays.equals(arr1,arr2)) ? true : false;

        System.out.println(isAnagram);




    }
}
