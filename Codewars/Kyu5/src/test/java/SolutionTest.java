import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

// Las clase de la Kata es Static por lo que no es necesario preparar un ambiente de prueba. Por eso se omiten métodos
// como BeforeEach, AfterEach, Setup, etc
public class SolutionTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(Solution.zeros(0), is(0));
        assertThat(Solution.zeros(6), is(1));
        assertThat(Solution.zeros(14), is(2));
    }
}