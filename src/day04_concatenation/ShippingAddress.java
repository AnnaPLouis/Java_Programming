package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Anna Louis",
                streetName = "Gary Ave",
                city = "Miami Beach",
                buildingNumber = "7272",
                state = "Fl";
        int zipCode = 33141;

        System.out.println("Your shipping address is:\n\t" + name +"\n\t"+ buildingNumber +
                " " + streetName +"\n\t"+ city +", "+ state +" "+ zipCode);


    }
}
