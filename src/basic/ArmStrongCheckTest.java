package basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArmStrongCheckTest {


    @Test
    public void testCorrectNumber() {
        int num = 153;
        boolean expected = true;
        boolean result = ArmstrongCheck.armStringCheck(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWrongNumber() {
        int num = 123;
        boolean expected = false;
        boolean result = ArmstrongCheck.armStringCheck(num);
        Assertions.assertEquals(expected, result);
    }
}
