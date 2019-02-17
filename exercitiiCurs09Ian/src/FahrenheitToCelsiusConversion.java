import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * We have the main method were we call our conversion degree methot
 * from three numbers given from keybord
 * Fahrenheit to Celsius Conversion
 *         - create a method that converts temperature from Fahrenheit to Celsius.
 *         - write a program that for a given (by the user) body temperature, measured in Fahrenheit degrees,
 *         outputs it in Celsius degrees, with the following message: "Your body temperature in Celsius degrees is X",
 *         where X is respectively the Celsius degrees.
 *         In addition if the measured temperature in Celsius is higher than 37 degrees,
 *         the program should warn the user that they are ill, with the following message "You are ill!".
 *         ( use the method created before)
 *Created 14Ian 2019
 * @RazvanB
 */

public class FahrenheitToCelsiusConversion {
   private static double celsiusDegree;

    public static void main(String[] args) {

        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Give a value for temperature in F degree");
            double fahrenheitDegree =keyboard.nextDouble();
            System.out.println("Your body temperature in Celsius degrees is "+
                    conversionTempFromFahrenheitToCelsius(fahrenheitDegree));
            if(conversionTempFromFahrenheitToCelsius(fahrenheitDegree)>37){
                System.out.println("You are ill!");
            }
        }catch (InputMismatchException e){
            System.out.println("exit inavlid input");
        }

    }

    public static double conversionTempFromFahrenheitToCelsius(double F){
        double celsiusDegree = (F-32)*5/9;
        return celsiusDegree;
    }

}
