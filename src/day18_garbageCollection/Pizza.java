package day18_garbageCollection;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;

    public void setInfo(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public int calcCost (){

        int cost = 2*numberOfCheeseToppings + 2*numberOfPepperoniToppings;

        if (size.equals("S")||size.equals("s")){
            cost += 10; }

            else if(size.equals("M")||size.equals("m")){
                cost += 12;}
            else if(size.equals("L")||size.equals("l")){
                cost += 14;}

        return cost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", cost=" + calcCost() +
                '}';
    }
}





