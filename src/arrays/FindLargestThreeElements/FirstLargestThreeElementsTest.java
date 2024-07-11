package arrays.FindLargestThreeElements;


import arrays.ArrayTestData;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FirstLargestThreeElementsTest {
    //test for invalid array length i.e number less than number of elements
    //test for null array
    //test for valid array

    @Test
    public void testInvalidArray(){
        int [] array = ArrayTestData.getEmptyArray();
        assertThrows(IllegalArgumentException.class, ()->FirstLargestThreeElements.findLargestElements(array));

    }

    @Test
    public void testEmptyArray(){
        int[]array = ArrayTestData.getEmptyArray();
        assertThrows(IllegalArgumentException.class, ()->FirstLargestThreeElements.findLargestElements(array));
    }

    @Test
    public void testValidArray(){
        int []array = ArrayTestData.getValidArray();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("FIRST", 6);
        expected.put("SECOND", 5);
        expected.put("THIRD", 4);
        assertEquals(expected, FirstLargestThreeElements.findLargestElements(array));

    }
}
