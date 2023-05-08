package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26];

        for (int i = 0,j = 'A'; i < ascending.length; i++, j++) {

            ascending[i] = (char) j;

        }

        System.out.println(Arrays.toString(ascending));

        char [] descending = new char[26];

        for (int i = descending.length - 1, j = 'A'; i >= 0; i--, j++) {

            descending[i] = (char) j;
        }

        System.out.println(Arrays.toString(descending));













    }
}
