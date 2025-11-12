package src.JavaPractise.numberGuessingGame;

import java.util.Scanner;

import src.JavaPractise.utilities.Utility;

public class NumberGuessing {
    public static void main(String[] args) {

        // setting varaible
        String number = "";
        int guessNum = 0;
 
        // random number ganerator
        int randomnum = (int) (Math.random() * 11);

        System.out.println(randomnum);
        // for user input
        Scanner scanner = new Scanner(System.in);

        /// while loop for checking integer
        ///
        while (guessNum != randomnum) {
            System.out.println("pick a number from 1 to 10");
            number = scanner.next();

            if (!Utility.isInteger(number)) {
                System.out.println("You seemed to pick a String");
                continue;
            }
            guessNum = Integer.parseInt(number);

            if (guessNum < 1 || guessNum > 10) {
                System.out.println("please type the number between 1 to 10");
                continue;
            }
            if (guessNum == randomnum) {
                System.out.println("Congratulations you guessed the correct number");
            } else {
                System.out.println("Keep on trying");
            }

        }

        scanner.close();

    }
}
