package LinearAlgs;

public class CircularLinkedList<T> {

    public boolean isCircularList(LinkedList<T>linkedList){
        //first get the head
        //start iterating from next node to head
        //if node becomes equal to head at any point, break and return true
        //else false

        Node<T>headNode = linkedList.getHead();
        if(headNode == null){
            return true;
        }
        Node<T>curr = headNode.getNext();

            while(curr != null && curr != headNode ){

                curr = curr.getNext();

            }

        return curr == headNode;

    }
}
