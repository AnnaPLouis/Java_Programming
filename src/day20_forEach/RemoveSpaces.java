package day20_forEach;

import java.util.Arrays;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java";

        str = str.trim();

        String result = "";

        String[] arr = str.split(" ");

        for (String each : arr) {

            if (!each.isEmpty()){

                result += each + " ";

            }

        }

        System.out.println(result);


    }
}
