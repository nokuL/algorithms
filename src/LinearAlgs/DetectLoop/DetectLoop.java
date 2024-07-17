package LinearAlgs.DetectLoop;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;

import java.util.HashMap;
import java.util.HashSet;

public class DetectLoop<T> {

public int deteactLoop(LinkedList<T>linkedList){
    //have two pointers , slow and fast
    //both start at head
    //slow moves once and fast moves twice
    //loop while fast pointe != null && fastpointer.next !=null
    //if fast == slow return true


    Node<T>fast = linkedList.getHead();
    Node<T>slow = linkedList.getHead();
    int length = 0;
    boolean hasLoop = false;


    while(fast!= null && fast.getNext() != null){
        fast = fast.getNext().getNext();
        slow = slow.getNext();
        if(fast== slow){
            hasLoop = true;
            break;
        }
    }

    if(hasLoop){
        slow = linkedList.getHead();
        while (slow != fast){
            slow = slow.getNext();
            length++;
        }

    }
    return length;

}
}
