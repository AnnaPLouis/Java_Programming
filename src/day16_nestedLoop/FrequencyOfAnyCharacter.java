package day16_nestedLoop;

public class FrequencyOfAnyCharacter {
    public static void main(String[] args) {

        String str = "aaaabbbbbcccceeefff";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count == 1 && !result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}