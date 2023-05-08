package day11_stringContinue;

public class CombineWords {
    public static void main(String[] args) {

        String word1 = "one";
        String word2 = "eight";

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            System.out.println(word1 + word2.substring(1));
        }
        else {
            System.out.println(word1+word2);
        }
    }
}