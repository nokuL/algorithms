import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroToEndTest {

    @Test
    public void testMoveToZero(){
        int [] ints = new int[]{0,1,0,3,12};
        int [] assertResult = new int[]{1,3,12,0,0};
        Assertions.assertArrayEquals(assertResult, MoveZeroToEnd.moveZeroToend(ints));
    }

}