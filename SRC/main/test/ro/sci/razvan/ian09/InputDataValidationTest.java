package ro.sci.razvan.ian09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputDataValidationTest {

    InputDataValidation inputDataValidation = new InputDataValidation();

    @Test
     public  void timeFormatCorect(){
        String timp = inputDataValidation.timeFormatCorect(4,4);
        Assertions.assertEquals( "04:04",timp);
    }
    @Test
    public  void timeFormatIncorect1() {
        assertThrows(IllegalArgumentException.class,
                ()-> { inputDataValidation.timeFormatCorect(24, 4);});
    }
}