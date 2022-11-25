import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddCheckerTest {

    @Test
    public void checkEvenTest() {
        assertTrue("The result is not correct", EvenOddChecker.check(4));
    }

    @Test
    public void checkOddTest() {
        assertFalse("The result is not correct", EvenOddChecker.check(3));
    }
}
