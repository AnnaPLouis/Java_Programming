package day16_nestedLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "XXXYYZZZZ";

        String result = "";

        char ch = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==ch){
                result += ch;
                ch++;
            }

        }
        System.out.println(result);
    }
}
