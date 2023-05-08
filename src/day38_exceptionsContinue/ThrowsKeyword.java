package day38_exceptionsContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Started");

            Thread.sleep(5000);

            System.out.println("Ended");

        System.out.println("------------------");

        System.out.println("Started");

        Thread.sleep(5000);

        System.out.println("Ended");

        FileInputStream file = new FileInputStream("");

    }


}
