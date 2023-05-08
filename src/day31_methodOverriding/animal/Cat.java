package day31_methodOverriding.animal;

public class Cat extends Animal{


    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat (){
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    public void sleep (){
        System.out.println("Cat " + getName() + " sleeps 12h a day");
    }
}
