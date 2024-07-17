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
        Assertions.assertTrue(detectLoop.detectLoop(linkedList));

    }
}
