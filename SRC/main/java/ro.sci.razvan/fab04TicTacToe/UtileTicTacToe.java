package ro.sci.razvan.fab04TicTacToe;

import java.sql.Array;

/**
 * @autor RazvanBineata
 * @Date 10.02.2019
 */

public class UtileTicTacToe {

    /**
     *
     * @param a
     * @return boolean
     * go through the matrix, and check if there is any element null
     */
    public static boolean isAnyPositionFree(String[][] a)  {
       for(int i=0; i<a.length; i++){
           for (int j=0; j<a.length; j++){
               if(a[i][j]==null)
                return true;
           }
       }
        System.out.println("game finished, no winner");
       return false;
    }

    /**
     * go through the matrix, and check if there is any line, column or diagonal not null
     * and whith a String(x or o) on it
     * @param a
     * @param player
     * @return boolean
     */
    public static boolean isThereAWinner(String[][] a, String player) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            //verifica liniile i
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if ((a[i][j] != null) && (a[i][j].equals(player))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("player " + player + " win!! - 1");
                return true;
            }

            //verifica coloanele i
            count=0;
            for (int d = 0; d < a.length; d++) {
                if ((a[d][i] != null) && (a[d][i].equals(player))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("player " + player + " win!! - 2");
                return true;
            }
        }

        //verifica diagonala (o singura data)
        count=0;
        for (int d = 0; d < a.length; d++) {
            if ((a[d][d] != null) && (a[d][d].equals(player))) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("player " + player + " win!! - 3");
            return true;
        }

        //verifica a doua diagonala o singura data
        count=0;
        int p = a.length-1;
        for (int i =0; i <a.length;i++){
            if((a[i][p] != null) && (a[i][p] == player)){
                count++;
            }
            p--;
        }
        if (count == 3) {
            System.out.println("player " + player + " win!! - 4");
            return true;
        }
        return false;
    }

    /**
     * it check if a given positionthere is null and if it is it assign a String(x or o)
     * @param a
     * @param player
     * @param i
     * @param j
     * @return
     */
    public static boolean verifyAndInsertIfPossitionIsFree(String[][] a, String player, int i, int j) {
        boolean flag = true;
        if (a[i][j] == null) {
            a[i][j] = player;
        } else {
            flag = false;
        }
        return flag;
    }


    /**
     * it check if a given positionthere is in matrix dimesion
     * @param x
     * @param y
     * @return
     */
    public static boolean isMoveAllowed(int x, int y) {
        boolean flag = false;
        if (x >= 0 && x <= 2 && y >= 0 && y <= 2) {
            flag = true;
            return flag;
        } else {
            flag = false;
            System.out.println("Give another number(s): ");
            return flag;
        }
    }
}
