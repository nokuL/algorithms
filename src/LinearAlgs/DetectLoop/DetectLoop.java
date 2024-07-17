package LinearAlgs.DetectLoop;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;
import java.util.HashSet;

public class DetectLoop<T> {

    public  boolean detectLoop(LinkedList<T>linkedList){
        Node<T> curr = linkedList.getHead();
        HashSet<Node<T>>hashSet = new HashSet<>();
        while(curr != null){
            if(hashSet.contains(curr.getNext())){
                return true;
              }
            hashSet.add(curr);
            curr = curr.getNext();
        }

        return false;

    }
}
