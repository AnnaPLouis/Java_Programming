package day31_methodOverriding.animal;

public class Dog extends Animal{

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println("Dog " + getName() + " is eating dog food");

    }


}
