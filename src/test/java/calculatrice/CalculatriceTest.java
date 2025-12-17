package calculatrice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.soustraction(3, 2));
    }

    @Test
    public void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    public void testDivision() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2, calc.division(6, 3));
    }
}
