package day32_finalKeyword.carTask;

import java.time.LocalDate;

public class Car {

    private String make, model, color;
    private int year;
    private double price;
    private static int numberOfWheels = 4;
    private static boolean hasBattery = true;


    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year<=0){
            System.err.println("Invalid year " + year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Invalid price " + price);
            System.exit(1);

        }
        this.price = price;
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ingition to start " + make + " " + model);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number of wheels=" + numberOfWheels +
                ", has battery =" + hasBattery +
                '}';
    }
}
