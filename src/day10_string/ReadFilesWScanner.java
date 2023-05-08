package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("/Users/anitataksa/IdeaProjects/Java_Programming/src/day10_string/Test.txt"));

        System.out.println( scan.nextLine());



    }
}
