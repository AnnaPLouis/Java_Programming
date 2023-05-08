package day34_abstraction_interface;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say Start");
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getColor() + " is self-driving");
    }


}
