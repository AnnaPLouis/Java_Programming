package day32_finalKeyword.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say Start");
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " is in self-driving mode");
    }

    @Override
    public void setModel(String model) {

        if (!(model == "Model Y" || model == "Model Z" || model == "Model X" || model == "Model 3")){
            System.err.println("Invalid model " + getModel() );
            System.exit(1);
        }

        super.setModel(model);

    }

    @Override
    public void setColor(String color) {

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Grey", "Black", "Silver"));
        if (!colors.contains(color)){
            System.err.println("Invalid color " + color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year<2008){
            System.err.println("Invalid year " + year);
            System.exit(1);
        }
        super.setYear(year);
    }




}
