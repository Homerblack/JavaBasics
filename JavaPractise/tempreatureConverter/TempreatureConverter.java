package JavaPractise.tempreatureConverter;

import java.util.Scanner;

import JavaPractise.utilities.Utility;

public class TempreatureConverter {

    public static void main(String[] args) {

        String type = "";
        Double value = null;
        boolean isDouble = false;
        // System.out.println(ConvertorMap.size());

        Scanner scanner = new Scanner(System.in);

        printOptions();

        // go get the type
        type = scanner.next();

        // Utility.isDouble(type);
        // value = scanner.next();

        // checking if the number is double or not
        while (!isDouble) {
            System.out.println("please enter Double number ");
            String checkvalue = scanner.next();

            if (Utility.isDouble(checkvalue)) {
                value = Double.parseDouble(checkvalue);
                isDouble = true;
            } else {
                System.out.println("please enter Double number ");
            }
        }

        getResult(type,value);
    }



    ///calculating all the values 
    public static void getResult(String type, Double value) {

        switch (type) {
            case "1":
                System.out.println("here is  Fahrenheit to celcious: " + Utility.FahrenheitToCelsius(value));
                break;
            case "2":
                System.out.println("here is  Fahrenheit to kelvin: " + Utility.FahrenheitToKelvin(value));
                break;
            case "3":
                System.out.println("here is  celcious to Fahrenheit: " + Utility.CelsiusToFahrenheit(value));
                break;
            case "4":
                System.out.println("here is  celcious to kelvin: " + Utility.CelsiusTokelvin(value));
                break;
            case "5":
                System.out.println("here is  kelvin to celcious: " + Utility.kelvinToCelsius(value));
                break;
            case "6":
                System.out.println("here is  kelvin to Fahrenheit: " + Utility.KelvinToFahrenheit(value));
                break;
            default:
             System.out.println("Enter the correct type");
             break;
        }
    }

    public static void printOptions(){

        System.out.println("Type 1 to convert Celsius to Fahrenheit");
        System.out.println("Type 2 to convert Celsius to kelvin");
        System.out.println("Type 3 to convert Fahrenheit to Celsius");
        System.out.println("Type 4 to convert Fahrenheit to kelvin");
        System.out.println("Type 5 to convert kelvin  to Celsius");
        System.out.println("Type 6 to convert Kelvin to fahrenheit");

        System.out.println("Type :  ");
    }

}
