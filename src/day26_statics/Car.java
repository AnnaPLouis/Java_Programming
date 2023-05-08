package day26_statics;

public class Car {

   public String make;
   public String model;
   public int year;
   public int price;
   public String color;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car(String make, String model, int year, int price) {
        this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, int year, int price, String color) {
        this(make,model,year,price);

        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}












