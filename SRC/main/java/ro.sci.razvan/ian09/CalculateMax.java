package ro.sci.razvan.ian09;

/**
 * We have the main method were we call our chek method that give as the biggest number
 * from three numbers given from keybord
 * Calculate Max
 * //     - Create a method getMax() with two integer (int) parameters,
 * that returns maximal of the two numbers.
 * //     - Write a program that reads three numbers from the console and
 * prints the biggest of them. Use the getMax() method you just created.
 *Created 14Ian 2019
 * @RazvanB
 */
import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("dati valori pentru a,b si c");
        int a =keyboard.nextInt();
        int b= keyboard.nextInt();
        int c= keyboard.nextInt();
        int max= getMax(a,b);
        max = getMax(max,c);
        System.out.println(max);
    }
    public static int getMax(int firstNr, int secondNr) {
        if (firstNr > secondNr) {
            return firstNr;
        } else {
            return secondNr;
        }
    }

}



