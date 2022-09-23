import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Las clase de la Kata es Static por lo que no es necesario preparar un ambiente de prueba. Por eso se omiten métodos
// como BeforeEach, AfterEach, Setup, etc
public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

}
