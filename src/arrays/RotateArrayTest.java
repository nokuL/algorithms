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
        int []array = ArrayTestData.getValidArray();
        int [] expected = ArrayTestData.getValidReversedArray();
        assertArrayEquals(expected, RotateArray.rotateArray(array, d));

    }

    @Test
    public void testInvalidArray(){
        int [] array = ArrayTestData.getEmptyArray();
        assertThrows(IllegalArgumentException.class, ()->RotateArray.rotateArray(array, d));

    }

    @Test
    public void testNullArray(){
        int [] array = ArrayTestData.getNullArray();
        assertThrows(IllegalArgumentException.class, ()->RotateArray.rotateArray(array, d));
    }

    @Test
    public void testArrayWithFullRotation(){
        int [] array = ArrayTestData.getValidArray();
        int [] expected = ArrayTestData.getValidArray();
        assertArrayEquals(expected, RotateArray.rotateArray(array, array.length));
    }

}