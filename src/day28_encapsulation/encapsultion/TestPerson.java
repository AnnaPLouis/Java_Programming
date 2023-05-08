package day28_encapsulation.encapsultion;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Anna", 31, 'F', LocalDate.of(1991,04,18));

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
        System.out.println(person1.getDateOfBirth());




    }
}
