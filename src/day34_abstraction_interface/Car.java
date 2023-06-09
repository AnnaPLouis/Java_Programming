package day34_abstraction_interface;

public abstract class Car {

    private final String make;

    private final String model;

    private String color;

    private final int year;

    private double price;


    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        if (year < 1886){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price: " + price);
        }
        this.price = price;
    }

    public final void stop(){
        System.out.println("Press the brakes");
    }

    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
