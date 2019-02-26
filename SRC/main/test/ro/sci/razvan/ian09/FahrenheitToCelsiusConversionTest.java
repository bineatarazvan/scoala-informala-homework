package ro.sci.razvan.ian09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelsiusConversionTest {

    FahrenheitToCelsiusConversion f = new FahrenheitToCelsiusConversion();

    @Test
    void conversionTempFromFahrenheitToCelsius() {
        double d = f.conversionTempFromFahrenheitToCelsius(5);
        Assertions.assertEquals(d, -15);

    }
    @Test
    void conversionTempFromFahrenheitToCelsius1() {
        double d = f.conversionTempFromFahrenheitToCelsius(0);
        Assertions.assertEquals(d, -17.77777777777778);
    }
    @Test
    void conversionTempFromFahrenheitToCelsius2() {
        double d = f.conversionTempFromFahrenheitToCelsius(99);
        Assertions.assertEquals(d, 37.22222222222222);

    }
}