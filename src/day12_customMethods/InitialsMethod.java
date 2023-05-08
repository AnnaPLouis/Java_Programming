package day12_customMethods;

public class InitialsMethod {
    public static void main(String[] args) {

        initials("Anna","Louis");
        initials("Ian", "Cloud");





    }

    public static void initials (String firstName, String lastName){

        System.out.println(firstName.charAt(0 ) + "." + lastName.charAt(0));
    }
}
