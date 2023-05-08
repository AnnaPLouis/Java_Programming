package day34_abstraction_interface;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Hold the brake, ignite with the key");
    }
}
