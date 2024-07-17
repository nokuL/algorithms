package LinearAlgs.DetectLoop;

import LinearAlgs.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DetectLoopTest {
    DetectLoop<Integer> detectLoop;

    @BeforeEach
    void setUp(){
        detectLoop = new DetectLoop<>();

    }

    @Test
    public void testValid(){
        LinkedList<Integer>linkedList = DetectLoopTestData.getValidList();
        Assertions.assertEquals(3, detectLoop.deteactLoop(linkedList));

    }

    @Test
    public void testInvalid(){
        LinkedList<Integer>linkedList = DetectLoopTestData.getInvalidList();
        Assertions.assertEquals(0, detectLoop.deteactLoop(linkedList));
    }

}
