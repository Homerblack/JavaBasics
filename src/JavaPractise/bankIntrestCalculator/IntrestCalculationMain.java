package src.JavaPractise.bankIntrestCalculator;

import java.util.Scanner;

public class IntrestCalculationMain {

    public static void main(String[] args) {

        int amount = 0;
        int years = 0;
        double intrestRate = 0;
        String userChoice = "";

        IntrestCalculation intrestCalculation = new IntrestCalculation();

        // user input
        Scanner scanner = new Scanner(System.in);

        //rendered user choice 
        userChoice = IntrestCalculation.getUserInput(scanner, "Type 1 for normal intrest ", "Type 2 for compound intrest ");        
    
        //rendered amount 
        amount = IntrestCalculation.getIntInput(scanner, "Enter Amount: ");

        //rendered years
        years = IntrestCalculation.getIntInput(scanner, "Enter Years: ");

        //rendered intrest rate 
        intrestRate = IntrestCalculation.getDoubleInput(scanner, "Enter Intrest Rate: ");

 
        // to calculate and do right calculation
        if (userChoice.equals("1")) {
            // normal rate
            double normalRate = intrestCalculation.calculateIntrestRateNormal(amount, years, intrestRate);
            System.out.println("The normal  rate is :  " + normalRate);
        } else {
            // compound rate
            double compoundNormalRate = intrestCalculation.calculateIntrestRateCompound(amount, years, intrestRate);
            System.out.println("The compound  rate is :  " + compoundNormalRate);
        }

        scanner.close();

    }

}
