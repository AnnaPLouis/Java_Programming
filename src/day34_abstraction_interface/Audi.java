package day34_abstraction_interface;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press start button");
    }

    public void autoPark(){
        System.out.println(getMake() + " " + getModel() + " performing self - parking");
    }


}
