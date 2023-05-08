package day29_inheritanceIntro.animalTask;

import day29_inheritanceIntro.animalTask.Animal;

public class Cat extends Animal {

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }

    public void scrath(){
        System.out.println(getName() + " is scratching");
    }
}
