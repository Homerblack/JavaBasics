package src.JavaPractise.testSysttem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        List<String> mixed = new ArrayList<>();

        // Path to your file (update this)
        System.out.println("Working directory: " + System.getProperty("user.dir"));
        File file = new File("C:/Users/sunit/IdeaProjects/JavaBasics/src.JavaPractise/testSysttem/random.txt");



        //i think this will give me only numbers
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String token = scanner.next();


                if (token.matches("\\d+")) {
                    numbers.add(token);
                } else if (token.matches("[a-zA-Z+]")) {
                    alphabet.add(token);
                } else {
                    mixed.add(token);
                }
            }
            scanner.close();
            System.out.println(numbers);
            System.out.println(alphabet);
            System.out.println(mixed);
        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }


}


