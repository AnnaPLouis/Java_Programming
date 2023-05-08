package day27_accessModifiers;

public class AccessModifie {

    public static int publicData = 200;

    protected static int protectedData = 100;

    static int defaultData = 300;

    private static int privateData = 50;



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }



}
