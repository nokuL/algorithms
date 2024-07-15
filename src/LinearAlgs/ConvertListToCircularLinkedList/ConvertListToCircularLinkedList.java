package LinearAlgs.ConvertListToCircularLinkedList;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;
import sun.awt.image.ImageWatched;

public class ConvertListToCircularLinkedList<T>{


    public LinkedList<T> convertLIst(LinkedList<T>linkedList){
        if(linkedList == null){
            throw new IllegalArgumentException("List cannot be now");
        }
        if(linkedList.getHead() == null){
            return linkedList;
        }
        Node<T> node = linkedList.getTail();
        node.setNext(linkedList.getHead());
        return linkedList;

    }
}
