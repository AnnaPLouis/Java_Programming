package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public int calcCost (){

        int cost = 2*numberOfCheeseToppings + 2*numberOfPepperoniToppings;


        switch (size){
            case 'S':
            case 's':
                cost +=10;
                break;

            case 'M':
            case 'm':
                cost +=12;
                break;

            case 'L':
            case 'l':
                cost +=14;
                break;

            default:
                System.err.println("Invalid size" + size);
        }

        return cost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)){
            System.err.println("Invalid object " + obj);
            System.exit(1);
        }
        if (size == ((Pizza) obj).size){
            if (numberOfCheeseToppings == ((Pizza) obj).numberOfCheeseToppings){
                if (numberOfPepperoniToppings == ((Pizza) obj).getNumberOfPepperoniToppings()){
                    return true;
                }
            }
        }
        return false;
    }
}
