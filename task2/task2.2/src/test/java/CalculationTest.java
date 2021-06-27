import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CalculationTest {
    private Calculation calc;

    @Rule
    public final ExpectedException ex = ExpectedException.none();

    @Rule
    public final Timeout time = Timeout.millis(1000);

    @Before
    public void makeCalculation() {
        calc = new Calculation();
    }

    @Ignore
    @Test
    public void testAdd() {
        double res = calc.add(3, 7);
        Assert.assertEquals(10.0, res, 0);
    }

    @Test
    public void testDeduct() {
        double res = calc.deduct(3, 7);
        Assert.assertEquals(-4.0, res, 0);
    }

    @Test
    public void testMult() {
        double res = calc.mult(3, 7);
        Assert.assertEquals(21.0, res, 0);
    }

    @Test
    public void testDivision() {
        double res = calc.division(10, 5);
        Assert.assertEquals(2.0, res, 0);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        ex.expect(ArithmeticException.class);
        calc.division(10, 0);
    }

    //@Test(timeout = 1000)
    @Test
    public void testN(){
        calc.add(1, 5);
    }
}