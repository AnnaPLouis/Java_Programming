package day27_accessModifiers;

public class TestNestedClass {
    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object

        obj1.new CarEngine(); //CarEnjine object

        new Car.StaticInnerClass();
    }
}
