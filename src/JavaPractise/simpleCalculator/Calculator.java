package src.JavaPractise.simpleCalculator;

import java.util.HashMap;
import java.util.Scanner;

import src.JavaPractise.utilities.Utility;

public class Calculator {

    public static void main(String[] args) {


        //creating a hashmap for the operators 
        HashMap<String, String> opeatorsMap = new HashMap<String, String>();
        opeatorsMap.put("+", "Additional");
        opeatorsMap.put("-", "Subtraction");
        opeatorsMap.put("*", "Multiplication");
        opeatorsMap.put("/", "Division");


        Numbers numbers = new Numbers("+", 3, 4);

        Scanner scanner = new Scanner(System.in);

        // making variables

        // operator variable
        String operator = "";

        // number varaiable for checking
        String number1 = "0";
        String number2 = "0";

        // number varaiable for calculating
        int num1 = numbers.getNumber1();
        int num2 = numbers.getNumber2();

        // boolean varaiable
        boolean isOperator = false;
        boolean numb1isInteger = false;
        boolean numb2isInteger = false;

        // program Start
        System.out.println("Here is the simple Calculator ");

        // check if the correct operator is entered or not
        while (!isOperator) {
            System.out.println("Please enter the operator (+ - * /) ");
            operator = scanner.next();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                isOperator = true;
                 operator = operator.trim();
            } else {
                System.out.println("ERROR: Invalid operator. Please choose from (+, -, *, /).");
            }
        }

        /// frist number code
        // check if the frist number is entered corectly or not
        while (!numb1isInteger) {
            System.out.println("Please enter the frist Number :");
            number1 = scanner.next();

            if (!Utility.isInteger(number1)) {

                System.out.println("Please enter the Correct Whole Number :");
                number1 = scanner.next();
            } else {
                num1 = Integer.parseInt(number1);
                numb1isInteger = true;
            }
        }

        /// 2nd number code
        // check if the 2nd number is entered corectly or not
        while (!numb2isInteger) {
            System.out.println("Please enter the 2nd Number :");
            number2 = scanner.next();

            if (!Utility.isInteger(number2)) {

                System.out.println("Please enter the Correct Whole Number :");
                number2 = scanner.next();
            } else {
                numb2isInteger = true;
                num2 = Integer.parseInt(number2);
            }
        }

        int result = numbers.calculate(operator, num1, num2);

     System.out.println("the\t" + opeatorsMap.get(operator) + "\tvalue is: " + result);

    }

}
