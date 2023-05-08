package day22_wrapperClasses;

public class MaxAndMin {
    public static void main(String[] args) {


        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        int max = -2147483648;

        int min = 2147483647;

        for (int[] ints : array) {

            for (int each : ints) {

                if (each > max){

                    max = each;
                }

                if (each < min){

                    min = each;
                }

            }

        }

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);


    }
}
