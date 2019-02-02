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
}