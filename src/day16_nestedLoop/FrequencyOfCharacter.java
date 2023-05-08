package day16_nestedLoop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        char ch = 'c';

        int result = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch){
                result++;
            }



        }

    }
}
