package LinearAlgs.exchangeNodes;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExchangeNodeTest {
    //test for valid list
    //test for invalid list
    ExchangeNode<Integer>exchangeNode;
    @BeforeEach
    public void setUp(){
        exchangeNode = new ExchangeNode<>();
    }

    @Test
    public void testValidList(){
        LinkedList<Integer>linkedList = ExchangeNodeTestData.getValidList();
        LinkedList<Integer>expected = new LinkedList<>();
        expected.addToHead(4);
        expected.addToTail(2);
        expected.addToTail(3);
        expected.addToTail(2);
        Node<Integer> tail = expected.getTail();
        Node<Integer>result = exchangeNode.getExchangedNodes(linkedList);
        Assertions.assertEquals(tail.getData(),  result.getData() );


    }
}
