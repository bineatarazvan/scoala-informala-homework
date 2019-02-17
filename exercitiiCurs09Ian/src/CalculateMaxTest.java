import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMaxTest {


    private CalculateMax c = new CalculateMax();


    @Test
    void main() {
    }

    @Test
    void getMax() {
        Assertions.assertEquals(3, c.getMax(5, 5));
    }
}