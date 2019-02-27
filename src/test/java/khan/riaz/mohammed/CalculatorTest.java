package khan.riaz.mohammed;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {

        calculator = new Calculator();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {

       int r =  calculator.add(1, 2);

       Assert.assertEquals("Equals", 3, r);


    }

    @Test
    public void subtract() {

        int a = calculator.subtract(2, 1);

        Assert.assertSame("Not same", a, 1);

    }

    @Test
    public void multiply() {

        int failing = calculator.multiply(3, 3);

        Assert.assertEquals("Failed", 3, failing);

    }

    @Test(expected = Exception.class)
    public void divide() {

        int divideByZero = calculator.divide(10, 0);

        Assert.assertEquals("DivideByZero", 1, divideByZero);

    }

    @Test(timeout = 1)
    public void modulus() {

        int timeout = calculator.modulus(5, 2);
        Assert.assertTrue(false);

    }

    @Ignore("This test is being disabled because it sucks")
    @Test
    public void percent() {

        Assert.assertTrue(true);

    }
}