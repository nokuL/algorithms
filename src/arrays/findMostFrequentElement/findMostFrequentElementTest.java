package arrays.findMostFrequentElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class findMostFrequentElementTest {

    @Test
    public void testValidArray(){
        int [] validArray = findMostFrequentElementTestData.getValidArray();
        int expected = 5;
        Assertions.assertEquals(expected, findMostFrequentElement.findMostFrequentElement(validArray));
    }
}
