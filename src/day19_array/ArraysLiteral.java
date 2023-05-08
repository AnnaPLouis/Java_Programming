package day19_array;

import java.lang.reflect.Array;

public class ArraysLiteral {

    public static void main(String[] args) {

        int numbers [] = new int [5];

        int [] nums = {1,2,3,4,5};

        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int n = 1;


        System.out.println(days[n-1]);

        String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        int n1 = 1;


        System.out.println(month[n1-1]);


        for (int i = month.length - 1; i >= 0; i--) {

            System.out.println(month[i]);

        }




    }






}
