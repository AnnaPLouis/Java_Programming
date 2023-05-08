package day31_methodOverriding.vehicleTask;

public class Bike extends Vehicle {

    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println("Riding "+getBrand()+" "+getModel());
    }
}
