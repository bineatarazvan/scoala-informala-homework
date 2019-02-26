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

    public static void main(String[] args) {
        int hh;
        int mm;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What time is it? pls set hour");
        hh = keyboard.nextInt();
        System.out.println("pls set minute");
        mm = keyboard.nextInt();
        String a = timeFormatCorect(hh,mm);
        System.out.println(a);
    }
    public static String timeFormatCorect(int h, int m) {
        if ((h < 0) || (h >= 24) || (m < 0) || (m > 59)) {
            throw new IllegalArgumentException("Erroare!!! ");
        }
        String hourStr = h < 10 ? "0" + h : String.valueOf(h);
        String minStr = m < 10 ? "0" + h : String.valueOf(m);
        return hourStr + ":" + minStr;
    }
}

