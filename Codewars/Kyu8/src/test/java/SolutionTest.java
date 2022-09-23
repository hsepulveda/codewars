import org.junit.Test;
import static org.junit.Assert.assertEquals;


// Las clase de la Kata es Static por lo que no es necesario preparar un ambiente de prueba. Por eso se omiten métodos
// como BeforeEach, AfterEach, Setup, etc
public class SolutionTest {
    @Test
    public void testSomething() {

        assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }
}
