package LinearAlgs.ConvertListToCircularLinkedList;

import LinearAlgs.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConvertLIstTest {

    ConvertListToCircularLinkedList<Integer> convertListToCircularLinkedList;
    LinkedList<Integer> circularLinkedList;

    @BeforeEach
     void setUp() {
        convertListToCircularLinkedList = new ConvertListToCircularLinkedList<>();
        circularLinkedList = new LinkedList<>();
        circularLinkedList.addToTail(1);
        circularLinkedList.addToTail(2);
        circularLinkedList.addToTail(3);
        circularLinkedList.getTail().setNext(circularLinkedList.getHead());
    }

    @Test
    public void testValidCircularLink() {
        LinkedList<Integer> linkedList = ConvertListData.getValidList();
        LinkedList<Integer> convertedList = convertListToCircularLinkedList.convertLIst(linkedList);
        Assertions.assertTrue(checkResult(convertedList));
    }

    private boolean checkResult(LinkedList<Integer> list1) {
       return list1.getTail().getNext().equals(list1.getHead());
    }
}
