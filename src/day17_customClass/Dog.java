package day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public int age;
    public String color;

    public void setInfo(String name, String breed, int age, String size, String color){
        this.name = name; // this keyword is used to call instance variable
        this.breed = breed;
        this.age  = age;
        this.size = size;
        this.color = color;



    }



    public void eat (){
        System.out.println(name + " is eating");
    }
    public void drink (){
        System.out.println(name + " is drinking water");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
