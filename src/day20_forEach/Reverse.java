package day20_forEach;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        int[] reverse = new int [arr1.length];

        int k = 0;

        for (int i = arr1.length - 1; i >= 0; i--,k++) {

            reverse[k] += arr1[i];

        }

        System.out.println(Arrays.toString(reverse));



        }

    }


