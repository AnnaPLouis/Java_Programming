package day35_polymorphism;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }
}
