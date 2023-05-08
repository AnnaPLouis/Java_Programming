package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = ""; //abc

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        System.out.println(result);








    }
}
