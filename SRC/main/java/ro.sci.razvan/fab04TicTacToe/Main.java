package ro.sci.razvan.fab04TicTacToe;

/**
 * @autor RazvanBineata
 * @Date 10.02.2019
 */

import java.util.Scanner;

public class Main {
    static String[][] ticTacToeConsole = new String[3][3];

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Choose a moved for player One. Moved should look like 0-0. From  0 to 2\n");
        boolean flag1 = true;
        String playerOne = "x";
        String playerTwo = "o";
        int moveX;
        int moveY;


        do {
            do {
                System.out.println("---->Palyer: X");
                System.out.println("Choose  x");
                moveX = key.nextInt();
                System.out.println("Choose  y");
                moveY = key.nextInt();
                flag1 = UtileTicTacToe.isMoveAllowed(moveX, moveY);

                if (flag1) {
                    flag1 = UtileTicTacToe.verifyAndInsertIfPossitionIsFree(ticTacToeConsole, playerOne, moveX, moveY);
                }
            } while (flag1 == false);


            for (int i = 0; i < ticTacToeConsole.length; i++) {
                System.out.println("\n_ _ _ _ _ _ _ _ _ _ ");
                for (int j = 0; j < ticTacToeConsole.length; j++) {
                    System.out.print("| " + ticTacToeConsole[i][j] + " |");
                }
            }
            flag1 = UtileTicTacToe.isThereAWinner(ticTacToeConsole, playerOne);
            if(flag1 == true)
                break;
            flag1=UtileTicTacToe.isAnyPositionFree(ticTacToeConsole);
            if (!flag1) {
                break;
            }
            do {
                System.out.println("---->Palyer: O");
                System.out.println("Choose X");
                moveX = key.nextInt();
                System.out.println("Choose Y");
                moveY = key.nextInt();
                flag1 = UtileTicTacToe.isMoveAllowed(moveX, moveY);
                if (flag1) {
                    flag1 = UtileTicTacToe.verifyAndInsertIfPossitionIsFree(ticTacToeConsole, playerTwo, moveX, moveY);
                }
            } while (flag1 == false);


            for (int i = 0; i < ticTacToeConsole.length; i++) {
                System.out.println("\n_ _ _ _ _ _ _ _ _ _ ");
                for (int j = 0; j < ticTacToeConsole.length; j++) {
                    System.out.print("| " + ticTacToeConsole[i][j] + " |");
                }
            }
            flag1 = UtileTicTacToe.isThereAWinner(ticTacToeConsole, playerTwo);
            if(flag1 == true)
                break;

            flag1 = UtileTicTacToe.isAnyPositionFree(ticTacToeConsole);
            if (!flag1) {
                break;
            }
        } while (flag1 != false);
        // public static boolean isThereAWinner(String[][] a, String player, int x, int y) {



    }
}
