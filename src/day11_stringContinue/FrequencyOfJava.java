package day11_stringContinue;

public class FrequencyOfJava {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python #C Ruby C++ Swift";

        int originalLength = sentence.length();

        String temp = sentence.replace("Java","abc");

        int tempLength = temp.length();

        System.out.println(sentence);
        System.out.println(temp);
        System.out.println(originalLength);
        System.out.println(tempLength);

        int numberOfJava = originalLength - tempLength;

        System.out.println(numberOfJava);
    }
}
