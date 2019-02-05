package ro.sci.razvan.fab04TicTacToe;

/**
 * @author Razvan Bineata
 * @version 1.0
 * @since 2019-02-05
 */

public class TicTacToeConsole {

    /**
     * There are two players that play X&0
     * when players want to move there it will be checked if the move can be done
     * if is ok, the move will b e executed, else will be displayed an error message
     */

    /**
     * Player 'X', enter your move (row[1-3] column[1-3]): 2 2
     *    |   |
     * -----------
     *    | X |
     * -----------
     *    |   |
     */
    public static boolean isMovedAllowed(String e){
        if(e==null){
            return true;
        }
        else{
            System.out.println("This move at (2,2) is not valid. Try again...\n");
            return false;
        }
    }

    public static void main(String[] args) {
        String [][] ticTacToeConsole = new String[3][3];
        boolean isThisMoveAllowed = false;


        System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): 2 2");

        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[1][1]);
        if (isThisMoveAllowed){
            ticTacToeConsole[1][1] = "X";
        }
        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("\n\n\nPlayer 'O', enter your move (row[1-3] column[1-3]): 1 1");
        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[0][0]);
        if(isThisMoveAllowed){
            ticTacToeConsole[0][0] = "O";
        }

        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): 1 3\n");
        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[0][2]);
        if(isThisMoveAllowed){
            ticTacToeConsole[0][2] = "X";
        }

        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("Player 'O', enter your move (row[1-3] column[1-3]): 3 1\n");
        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[2][0]);
        if(isThisMoveAllowed){
            ticTacToeConsole[2][0] = "O";
        }

        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): 2 2\n");

        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[1][1]);

        if(isThisMoveAllowed){
            ticTacToeConsole[1][1] = "X";
        }
        else{
            System.out.println("This move at (2,2) is not valid. Try again...\n");
        }


        System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): 2 3\n");

        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[1][2]);
        if(isThisMoveAllowed){
            ticTacToeConsole[1][2] = "X";
        }

        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("Player 'O', enter your move (row[1-3] column[1-3]): 2 1\n");
        isThisMoveAllowed = isMovedAllowed(ticTacToeConsole[1][0]);
        if(isThisMoveAllowed){
            ticTacToeConsole[1][0] = "O";
        }

        for(int i = 0; i<ticTacToeConsole.length; i++){
            System.out.println("\n\t_ _ _ _ _ _ _ _ _ _ ");
            for(int j = 0; j<ticTacToeConsole.length; j++){
                System.out.print("| " + ticTacToeConsole[i][j]+" |");
            }
        }

        System.out.println("\nPlayer 'O' won! ");


//        for(String[] linie : ticTacToeConsole){
//            for (String element: linie) {
//               // ticTacToeConsole[g][p]);
//                System.out.println(ticTacToeConsole[linie][element]);
//            }
//        }
    }
}
