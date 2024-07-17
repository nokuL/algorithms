package LinearAlgs.exchangeNodes;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;
import org.junit.jupiter.api.Test;
import sun.awt.image.ImageWatched;

public class ExchangeNodeTestData {

    public static LinkedList<Integer>getValidList(){
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.addToHead(2);
        linkedList.addToTail(3);
        linkedList.addToTail(2);
        linkedList.addToTail(4);
        Node<Integer> tail = linkedList.getTail();
        tail.setNext(linkedList.getHead());
        return linkedList;
    }

    public static LinkedList<Integer>getInvalidList(){
        return null;
    }
}
