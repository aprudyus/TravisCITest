import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdding() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(1, 1), 2);
    }
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(calc.subtract(1, 1), 0);
    }
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(calc.multiplicate(3, 5), 15);
    }
    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(calc.divide(8, 2), 4);
    }
}
