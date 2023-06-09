package task;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));


        List<Apple> greenApples = filterApples(inventory, new AppleGreenPredicate());

        System.out.println(greenApples);


        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyPredicate());

        System.out.println(heavyApples);

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (applePredicate.test(apple)){

                result.add(apple);

            }

        }

        return result;
    }
}


