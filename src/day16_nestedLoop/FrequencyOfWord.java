package day16_nestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java JAVA jAVa JavA";
        String word = "Java";
        int count = 0;

        str = str.toLowerCase();
        word  =word.toLowerCase();

        while (str.contains(word)){
            count++;
            str = str.replaceFirst(word,"");

        }

        System.out.println(count);










    }
}
