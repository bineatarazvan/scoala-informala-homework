package ro.sci.razvan.ian09;

import java.util.Scanner;

/**
 *
 * - write a program that asks the user what time it is, by printing on the console "What time is it?".
 * Then the user must enter two numbers – one for hours and one for minutes. If the input data represents a valid time,
 * the program must output the message " The time is hh:mm now.",
 * where hh respectively means the hours, and mm – the minutes. If the entered hours or minutes are not valid,
 * the program must print the message " Incorrect time!". The validation must be implemented in a separate method.
 *Created 14Ian 2019
 * @RazvanB
 */
public class InputDataValidation {
    private static int hh;
    private static int mm;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What time is it?");
        hh = keyboard.nextInt();
        mm = keyboard.nextInt();
        isTimeFormatCorect(hh,mm);
    }
    public static boolean isTimeFormatCorect(int h, int m){
        if((h>=0)&&(h<=24)&&(m>=0)&&(m<=59)){
//            System.out.println(" The time is " +((hh < 10 ? "0" : "") + hh)+ ":" +((mm < 10 ? "0" : "") + mm)+ " now.");
            System.out.println(String.format("%02d:%02d", hh,mm));  //de intrebat de ce nu merge
            //System.out.print("%02d",hh);
            return true;
        }
        else{
            System.out.println(" Incorrect time!");
            return false;
        }
    }

}