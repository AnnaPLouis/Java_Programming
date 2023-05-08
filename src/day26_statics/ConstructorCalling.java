package day26_statics;

public class ConstructorCalling {

    public ConstructorCalling(){
        System.out.println("Default constructor");
    }

    public ConstructorCalling(int a){
        this();
        System.out.println("Constructor with int argument");
    }


    public static void main(String[] args) {

        method1();

        method2();









    }

    public static void method1(){
        System.out.println("Method 1");
    }
    public static void method2(){

    method1();
        System.out.println("Method 2");



}
}
