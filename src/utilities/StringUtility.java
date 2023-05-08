package utilities;

import java.util.Scanner;

public class StringUtility {



    public static String reverse(String str) {

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--) {

            reverse += str.charAt(i);
        }

        return reverse;


    }public static void login(String username, String password) {

        Scanner input = new Scanner(System.in);

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 2; i++) {

                System.err.println("Wrong credentials. Try again!");
                username = input.next();
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is blocked");
            }


        }
    }
    public static int frequency(String sentence, String word){

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }



    public static int frequency(String str, char ch){
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;

    }



    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }

        }

        return result;
    }

    public static boolean isPalindrome (String str) {

        boolean flag = false;

        String reversed = "";

        if (str.contains(" ")) {
            str.replace(" ", "");
        }

        str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
        if (str.equals(reversed)){
            flag = true;
        }
        return flag;
    }
}