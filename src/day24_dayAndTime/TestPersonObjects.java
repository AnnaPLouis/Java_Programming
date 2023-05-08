package day24_dayAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Anna", 'F', LocalDate.of(1991,4,18));
        people[2].setInfo("Maria",'F', LocalDate.of(1965, 7, 9));
        people[3].setInfo("Boris", 'M', LocalDate.of(1957,6,25));
        people[4].setInfo("Natalia", 'F', LocalDate.of(1987, 9,4));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object
        for (Person each : studentsList) {

            System.out.println(each.name + ": " +each.dateOfBirth);
        }


        studentsList.removeIf(person -> person.age > 55);

        System.out.println(studentsList);

        }


        // remove all the person object that has the age > 55


    }

