import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FactorialTestNGTest {

    @BeforeMethod
    public void setup() {
        // Setup code if needed
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = Factorial.factorial(5);
        Assert.assertEquals(result, 120, "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorialOfZero() {
        long result = Factorial.factorial(0);
        Assert.assertEquals(result, 1, "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialOfSmallPositiveNumber() {
        long result = Factorial.factorial(3);
        Assert.assertEquals(result, 6, "Factorial of 3 should be 6");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        long result = Factorial.factorial(10);
        Assert.assertEquals(result, 3628800, "Factorial of 10 should be 3628800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-1);  // This should throw IllegalArgumentException
    }

    @Test
    public void testFactorialOfVeryLargeNumber() {
        long result = Factorial.factorial(20);
        Assert.assertEquals(result, 2432902008176640000L, "Factorial of 20 should be 2432902008176640000");
    }

    @Test
    public void testFactorialOfBoundaryNumber() {
        long result = Factorial.factorial(15);
        Assert.assertTrue(result > 0, "Factorial of 15 should be a positive number.");
    }
}
