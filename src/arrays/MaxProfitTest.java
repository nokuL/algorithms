package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProfitTest {

    @Test
    public void checkMaxProfit(){
        int [] array = {1,2,3,4,5};
        int result = MaximumProfit.maxProfit(array);
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }
}
