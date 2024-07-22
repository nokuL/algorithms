package arrays.findMaximumNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class findMaxNumberTest {

    @Test
    public void testValidArray(){
        int[] validArray = findMaxNumberTestData.getValidArray();
        int expected = 80;
        Assertions.assertEquals(expected, findMaxNumber.findMaxNumber(validArray));
    }

    @Test
    public void testInvalidArray(){
        int [] invalidArray = findMaxNumberTestData.getNullArray();
        Assertions.assertThrows(IllegalArgumentException.class, ()->findMaxNumber.findMaxNumber(invalidArray));
    }

    @Test
    public void testEqualArray(){
        int[] validArray = findMaxNumberTestData.getArrayWithNoMaxNum();
        int expected = 1;
        Assertions.assertEquals(expected, findMaxNumber.findMaxNumber(validArray));
    }

}
