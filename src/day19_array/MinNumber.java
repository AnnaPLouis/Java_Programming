package day19_array;

public class MinNumber {
    public static void main(String[] args) {


        int[] number = {10,60,89,100,-3};

        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] < min){
                min = number[i];
            }

        }
        System.out.println(min);
    }
}
