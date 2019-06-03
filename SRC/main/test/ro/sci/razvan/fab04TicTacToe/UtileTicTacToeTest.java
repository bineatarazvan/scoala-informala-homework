package ro.sci.razvan.fab04TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtileTicTacToeTest {

    @Test
    void isAnyPositionFree1RetTRue() {
        String[][] ticTacToeConsole = {{"","",null},{"","",null},{"","",null}};
        boolean flag = UtileTicTacToe.isAnyPositionFree(ticTacToeConsole);
        Assertions.assertEquals(flag,true);
    }
    @Test
    void isAnyPositionFree2RetTrue() {
        String[][] ticTacToeConsole = {{null,null,null},{null,null,null},{null,null,null}};
            boolean flag = UtileTicTacToe.isAnyPositionFree(ticTacToeConsole);
            Assertions.assertEquals(flag,true);
    }
    @Test
    void isAnyPositionFree3RetFalse() {
        String[][] ticTacToeConsole = {{"","",""},{"","",""},{"","",""}};
        boolean flag = UtileTicTacToe.isAnyPositionFree(ticTacToeConsole);
        Assertions.assertEquals(flag,false);
    }


    @Test
    void isThereAWinnerVerifyLine() {
        String[][] tictacT = {{"x", "x", "x"}, {"", null, null}, {"", "", ""}};
        boolean flag = UtileTicTacToe.isThereAWinner(tictacT, "x");
        Assertions.assertEquals(flag, true);
    }
    @Test
    void isThereAWinnerVerifyColumn() {
        String[][] tictacT = {{"x", "o", "x"}, {"x", null, "o"}, {"x", null, "o"}};
        boolean flag = UtileTicTacToe.isThereAWinner(tictacT, "x");
        Assertions.assertEquals(flag, true);
    }
    @Test
    void isThereAWinnerVerifyDiagonal() {
        String[][] tictacT = {{"x", "o", "x"}, {"o", "x", null}, {"o", "", "x"}};
        boolean flag = UtileTicTacToe.isThereAWinner(tictacT, "x");
        Assertions.assertEquals(flag, true);
    }
    @Test
    void isThereAWinnerVerifyallCasses() {
        String[][] tictacT = {{"x", "o", "x"}, {"null", "null", null}, {"o", "x", "o"}};
        boolean flag = UtileTicTacToe.isThereAWinner(tictacT, "x");
        Assertions.assertEquals(flag, false);
    }

    @Test
    void verifyAndInsertIfPossitionIsFreeRetTrue() {
        String[][] ticTac = {{null, null,null},{null,null,null},{null,null,null}};
        boolean flag = UtileTicTacToe.verifyAndInsertIfPossitionIsFree(ticTac,"",0,0);
        Assertions.assertEquals(flag,true);
    }
    @Test
    void verifyAndInsertIfPossitionIsFreeRetFalse() {
        String[][] ticTac = {{"x", null,null},{null,null,null},{null,null,null}};
        boolean flag = UtileTicTacToe.verifyAndInsertIfPossitionIsFree(ticTac,"",0,0);
        Assertions.assertEquals(flag,false);
    }

    @Test
    void isMoveAllowed1RetTrue() {
        boolean flag = UtileTicTacToe.isMoveAllowed(0,0);
        Assertions.assertEquals(flag,true);
    }
    @Test
    void isMoveAllowed2RetTrue() {
        boolean flag = UtileTicTacToe.isMoveAllowed(2,2);
        Assertions.assertEquals(flag,true);
    }
    void isMoveAllowed3RetFalse() {
        boolean flag = UtileTicTacToe.isMoveAllowed(2,3);
        Assertions.assertEquals(flag,false);
    }
}


