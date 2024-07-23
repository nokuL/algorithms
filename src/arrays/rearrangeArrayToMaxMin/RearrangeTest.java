package arrays.rearrangeArrayToMaxMin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RearrangeTest {

    @Test
    public void testRearrange(){
        int [] array = new int []{1, 3, 4, 5,8, 9};
        int [] expected = new int[] {9, 1, 8, 3, 5, 4};
        Assertions.assertArrayEquals(expected, RearrangeToMaxMin.rearrange(array));
    }
}
