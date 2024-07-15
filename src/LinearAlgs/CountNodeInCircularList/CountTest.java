package LinearAlgs.CountNodeInCircularList;

import LinearAlgs.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountTest {

    //test  an invalid circular linked list
    //test a valid circular linkedList
    //test list with 1
    //test list with null i.e null head
    //
    CountNodeInCircularList<Integer> countNodeInCircularList;

    @BeforeEach
    void setUp(){
        countNodeInCircularList = new CountNodeInCircularList<>();


    }


    @Test
    public void testInvalidCircularList(){
        LinkedList<Integer>linkedList = CountNodeTestData.getInvalidCircularList();
        Assertions.assertThrows(IllegalArgumentException.class, ()->{countNodeInCircularList.countNodeInCircularList(linkedList);});

    }

    @Test
    public void testValidCircularList(){
        LinkedList<Integer>linkedList = CountNodeTestData.getValidCircularList();
        Assertions.assertEquals(5, countNodeInCircularList.countNodeInCircularList(linkedList));
    }

    @Test
    public void testListWIthOneElement(){
        LinkedList<Integer>linkedList = CountNodeTestData.getOneElCircularList();
        Assertions.assertEquals(1, countNodeInCircularList.countNodeInCircularList(linkedList));
    }

    @Test
    public void testNullList(){
        LinkedList<Integer>linkedList = CountNodeTestData.getNullCircularLIst();
        Assertions.assertThrows(NullPointerException.class, ()-> countNodeInCircularList.countNodeInCircularList(linkedList));
    }
}
