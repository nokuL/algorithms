package arrays.moveZerosToEnd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoveZerosTest {
    //test valid array
    //test array with no zeros
    //array with one element
    //test with element > 100
    @BeforeAll
    static void setUp() {

    }

    @Test
    public void testValidArray() {
        //{4, 0, 0, 3, 4}
        int[] expected = {4, 3, 4, 0, 0};
        int[] array = MoveZerosTestData.getValidArray();
        Assertions.assertArrayEquals(expected, MoveZeros.moveZeros(array));

    }
    @Test
    public void testNullArray(){
        int [] nullArray = MoveZerosTestData.getInvalidArray();
        Assertions.assertThrows(IllegalArgumentException.class, ()->MoveZeros.moveZeros(nullArray));
    }

    @Test
    public void testArrayWithoutZeros() {
        int[] array = MoveZerosTestData.getArrayWithoutZeros();
        Assertions.assertThrows(IllegalArgumentException.class, () -> MoveZeros.moveZeros(array));
    }

}
