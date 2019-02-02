package ro.sci.razvan.ian09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputDataValidationTest {

    InputDataValidation inputDataValidation = new InputDataValidation();

    @Test
    void isTimeFormatCorect() {
        boolean time = inputDataValidation.isTimeFormatCorect(11,11);
        Assertions.assertEquals(time,true);
    }
    @Test
    void isTimeFormatIncoretFromatMinute() {
        boolean time = inputDataValidation.isTimeFormatCorect(24,60);
        Assertions.assertEquals(time,false);
    }
    void isTimeFormatIncoretFromatHour() {
        boolean time = inputDataValidation.isTimeFormatCorect(25,58);
        Assertions.assertEquals(time,false);

    }
}