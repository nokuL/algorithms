package LinearAlgs.DetectLoop;

import LinearAlgs.LinkedList;

public class DetectLoopTestData {

    public static LinkedList<Integer> getValidList(){
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.addToHead(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);
        linkedList.addToTail(5);
        linkedList.getTail().setNext(linkedList.findNodeByData(3));
        return linkedList;
    }

    public static LinkedList<Integer> getInvalidList(){
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.addToHead(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);
        linkedList.addToTail(5);
        return linkedList;
    }


}
