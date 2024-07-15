package LinearAlgs.CountNodeInCircularList;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;

public class CountNodeTestData {

    public static LinkedList<Integer> getValidCircularList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addToTail(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);
        linkedList.addToTail(5);
        Node<Integer> tail = linkedList.getTail();
        tail.setNext(linkedList.getHead());
        return linkedList;

    }

    public static LinkedList<Integer>getInvalidCircularList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addToTail(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);
        linkedList.addToTail(5);
        return linkedList;

    }


    public static LinkedList<Integer>getNullCircularLIst(){
        return null;
    }

    public static LinkedList<Integer>getEmptyList(){
        LinkedList<Integer>linkedList = new LinkedList<>();
        return linkedList;
    }

    public static LinkedList<Integer>getOneElCircularList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addToTail(1);
              return linkedList;

    }
}
