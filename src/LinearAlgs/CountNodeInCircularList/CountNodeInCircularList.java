package LinearAlgs.CountNodeInCircularList;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;

import java.util.concurrent.Callable;


public class CountNodeInCircularList <T>{

    public  int countNodeInCircularList(LinkedList<T>linkedList){
        int headCount = 0;
        int nodeCount = 0;
        if(!isaCircularList(linkedList)){
            throw new IllegalArgumentException("Invalid list");
        }else{
            try{
                Node<T>head = linkedList.getHead();
                Node<T>curr = linkedList.getHead();
                while(curr != null){
                    if(curr == head){
                        if(headCount > 0){
                            break;
                        }
                        headCount++;

                    }
                    nodeCount++;
                    curr = curr.getNext();

                }
            }catch(NullPointerException e){
                System.out.println("NUll pointer");

            }



        }
        return nodeCount;
    }

    public boolean isaCircularList(LinkedList<T>linkedList){
      //get the head node
        //get the next to head node
        //iterate from next node to while curr != null && curr != head
        //curr = curr.getNext
        //return curr == head

        Node<T>head = linkedList.getHead();
        Node<T>curr = head.getNext();
        if(curr == null){
            return true;
        }
        while (curr != null && curr != head){
            curr = curr.getNext();
        }
        return curr == head;
    }
}
