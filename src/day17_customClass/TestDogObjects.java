package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.size = "Large";
        dog1.color = "Grey";

        Dog dog2 = new Dog();

        System.out.println(dog1);
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Chow Chow", 5, "Large", "Beige");


        Dog dog4  = new Dog();
        dog4.setInfo("Chuck","Bulldog", 3, "Small", "White");

        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();

        dog1.drink();



    }

}
