import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void twoSumTest(){
        int []array = new int[]{2,7, 3,11};
        int target = 5;
        int [] expected = new int[]{2, 0};
        Assertions.assertArrayEquals(expected, TwoSum.twoSum(array, target));
    }

}