package day28_encapsulation.encapsultion;

public class Student {

    private int age;

    private String name;

    public int getAge(){
        if (age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){

        if (age<1 || age>100){
            System.err.println("Invalid Age:" + age);
            //return; exits the method
            System.exit(1); // program gets terminated
        }

        this.age = age;

    }

    public void setName(String name){

        boolean hasDigits = false;
        boolean hasSpecialCharacters = false;

        for (char each: name.toCharArray()){
            if (Character.isDigit(each)){
                hasDigits = true;
                break;
            }

            if (!Character.isLetter(each) && !Character.isDigit(each)){
                hasSpecialCharacters = true;
            }
        }

        if (hasDigits || hasSpecialCharacters){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }

        this.name=name;

    }

    public String getName(){

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }
}
