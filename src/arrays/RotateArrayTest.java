package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    int d;
    @BeforeEach
    public void setUp(){
        d = 2;
    }



    @Test
    public void testRotateValidArray(){
        int []array = RotateArrayTestData.getValidArray();
        int [] expected = RotateArrayTestData.getValidReversedArray();
        assertArrayEquals(expected, RotateArray.rotateArray(array, d));

    }

    @Test
    public void testInvalidArray(){
        int [] array = RotateArrayTestData.getEmptyArray();
        assertThrows(IllegalArgumentException.class, ()->RotateArray.rotateArray(array, d));

    }

    @Test
    public void testNullArray(){
        int [] array = RotateArrayTestData.getNullArray();
        assertThrows(IllegalArgumentException.class, ()->RotateArray.rotateArray(array, d));
    }

}