package day28_encapsulation.encapsultion;

import java.time.LocalDate;

public class Person {

    private String name;

    private int age;

    private char gender;

    private LocalDate dateOfBirth;

    public void setName (String name){

        if (name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name: "+ name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getName(){

        if (name == null) {
            return "Unknown";
        }

        return name;
    }

    public void setAge(int age){
        if (age < 0 || age > 120){
            System.err.println("Invalid age: "+ age);
            System.exit(1);
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender( char gender){
        if(gender != 'M' && gender != 'F'){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    public void setDateOfBirth (LocalDate dateOfBirth){

        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid date of birth: " + dateOfBirth);
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;

    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}



