package LinearAlgs;

public class FindMiddleNode<T> {

    public Node<T>findMiddleNode(LinkedList<T>linkedList){
        Node<T>fast = linkedList.getHead();
        Node<T>slow = linkedList.getHead();

        while(fast != null){
            fast = fast.getNext();

            if(fast!=null){
                fast = fast.getNext();
                slow = slow.getNext();
            }
        }
        return slow;

    }
}
