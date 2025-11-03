package JavaPractise.utilities;

public class Utility {

    //// check is integer

    public static boolean isInteger(String input) {
        // checking null
        if (input == null) {
            return false;
        }
        // check if the input value is integer or not
        try {
            Integer.parseInt(input);
            return true;
            // catch the Number exception
        } catch (NumberFormatException e) {

        }
        return false;
    }


////check if the inputed number is double or not 

    public static boolean isDouble(String input ){
        if(input == null){
            return false;
        }
        //check if the inputed number is double or not 
        try{
            Double.parseDouble(input);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    /// Celsius to Fahrenheit Converter

    public static double CelsiusToFahrenheit(double input) {

        double Fahrenheit = 0.00;

        Fahrenheit = input * 9/5 + 32;

        // F = C * 9/5 + 32

        return Fahrenheit;
    }

    /// Celsius to Kelvin Converter

    public static double CelsiusTokelvin(double input) {
        double kelvin = 0.00;
         kelvin = (input + 273.15);
        return kelvin;


    }

    ///Fahrenheit to Celsius Converter

    public static double FahrenheitToCelsius(double input) {

        double celcious = 0.00;
        celcious = ((input - 32) / (9/5));
        return celcious;
    }

    ///  Fahrenheit  to kelvin Converter

    public static double FahrenheitToKelvin(double input) {
        double kelvin = 0.00;
        kelvin = (input + 459.67) * 5/9;
        return kelvin;
    }

    ///kelvin to  Celsius Converter

    public static double kelvinToCelsius(double input) {
         double celcious = 0.00;
        celcious = input - 273.15;
        return celcious;
    }

    /// Kelvin to Fahrenheit Converter

    public static double KelvinToFahrenheit(double input) {

        double Fahrenheit = 0.00;
        Fahrenheit = input * 9/5 - 459.67;
        return Fahrenheit;
    }

}
