package ro.sci.razvan.ian09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMaxTest {

    @Test
    void getMax() {
        int a = CalculateMax.getMax(1,2);
        Assertions.assertEquals(a,2);
    }
    @Test
    void getMax1() {
        int a = CalculateMax.getMax(3,2);
        Assertions.assertEquals(a,3);
    }
    @Test
    void getMax2() {
        int a = CalculateMax.getMax(0,0);
        Assertions.assertEquals(a,0);
    }
    @Test
    void getMax3() {
        int a = CalculateMax.getMax(-2,-3);
        Assertions.assertEquals(a,-2);
    }
}

