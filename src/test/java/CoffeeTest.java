import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {

    private Coffee emptyCoffee;
    private Coffee actualCoffee;
    private double deltaValue = 0.000001;

    @Before
    public void setup() {
        actualCoffee = new Coffee("The bean", "espresso", 5.99);
        // Treat it like a global function, accessible to any other method!!
        // Every test method will run the @Before before @Test
    }

    @Test
    public void testCoffeeNoArgConstructor() {
        actualCoffee = new Coffee();

        // assert that emptyCoffee is null
        assertNull(emptyCoffee);
        // assert that actualCoffee is !null
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgConstructor() {
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeGetters() {
        assertEquals(actualCoffee.getName(), "The bean");
        assertEquals(actualCoffee.getRoast(), "espresso");
        assertEquals(actualCoffee.getPrice(), 5.99, deltaValue);
    }

    @Test
    public void testCoffeeSetters() {
        actualCoffee.setName("The bean Two");

        assertEquals(actualCoffee.getName(), "The bean Two");

        actualCoffee.setRoast("dark");
        assertEquals(actualCoffee.getRoast(), "dark");

        actualCoffee.setPrice(6.49);
        assertEquals(actualCoffee.getPrice(), 6.49, deltaValue);
    }
}
