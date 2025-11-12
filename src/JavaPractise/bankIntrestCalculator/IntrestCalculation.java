package src.JavaPractise.bankIntrestCalculator;

import java.util.Scanner;

import src.JavaPractise.utilities.Utility;

public class IntrestCalculation{


    private int amount ;

    private int years;

    private double intrestRate;


   ///constructors  

   /* IntrestCalculation(int amount, int years, double intrestRate){

        this.amount = amount;
        this.years = years;
        this.intrestRate = intrestRate;
    }
     */

    //getter for amount

    public int  getAmount(){
        return amount;
    }

    //setter for amount 

    public void setAmount(int amount){
        this.amount = amount;
    }


    //getter foar years
    public int getYears(){
        return years;
    }

    //setter for years 

    public void setYears(int years){
        this.years = years;
    }

    //getter for intrest rate
    public double intrestRate(){
        return intrestRate;
    }

    //setter for intrest rate
    public void setintrestRate(double intrestRate){
        this.intrestRate = intrestRate;
    }


    ///calculation of  normal intrest rate 
    public double calculateIntrestRateNormal(int amount, int years, double intrestRate){
        //normal intrest rate formulae 
        double normalIntrest = ((amount * intrestRate * years)/100);
        return normalIntrest;
    }


    ///calculation of compound intrest rate 
    public double calculateIntrestRateCompound(int amount, int years, double intrestRate){

        //compound intrest rate formulae 
        double compoundIntrestAmount = (amount * Math.pow((1 + intrestRate/100),years));
        double  compoundIntrest = compoundIntrestAmount - amount;
         return compoundIntrest;
    }

    ///Checking integer 
    public static int getIntInput(Scanner scanner, String message){
        while(true){
            System.out.println(message);
            String input = scanner.next();

            if(Utility.isInteger(input)){
                return Integer.parseInt(input);
            }
            System.out.println("please insert double number");
        }

        
    }

        ///Checking double
    public static double getDoubleInput(Scanner scanner, String message){
        while(true){
            System.out.println(message);
            String input = scanner.next();

            if(Utility.isDouble(input)){
                return Double.parseDouble(input);
            }
            System.out.println("please insert double number");
        }

        
    }
        ///Checking Userinput
    public static String getUserInput(Scanner scanner, String message1, String message2){
        while (true) {
            System.out.println(message1);
            System.out.println(message2);
        String input = scanner.next();
        if(input.equals("1")){
            System.out.println("calculating normal intrest rate");
            return input;
        }else if(input.equals("2")){
            System.out.println("calculating compound intrest rate");
             return input;
        }else{
         System.out.println("can you please choose between 1 and 2 ");
        }    
        }
    }

}


