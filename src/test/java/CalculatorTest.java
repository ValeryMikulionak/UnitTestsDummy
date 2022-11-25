import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

        @Test
        public void addTest() {
            assertEquals ("The result is not correct", 2, calc.add(1, 1));
    }

        @Test
        public void subtractTest() {
            assertEquals ("The result is not correct", 1, calc.subtract(3, 2));
    }

        @Test
        public void multiplyTest() {
            assertEquals ("The result is not correct", 12, calc.multiply(2, 6));
    }

        @Test
        public void divideTest() {
            assertEquals ("The result is not correct", 4, calc.divide(20, 5));
    }

}
