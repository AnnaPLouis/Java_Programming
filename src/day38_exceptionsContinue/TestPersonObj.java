package day38_exceptionsContinue;

public class TestPersonObj {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel",32, 'M');

        System.out.println(person1);

        person1.setAge(-25);

        System.out.println(person1);


    }
}
