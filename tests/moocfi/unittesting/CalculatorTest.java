package moocfi.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(42);
        calculator.add(-2);

        assertEquals(40, calculator.getValue());
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(24);
        calculator.subtract(-4);

        assertEquals(-20, calculator.getValue());
    }
}