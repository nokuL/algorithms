package LinearAlgs;

public class FindMiddleNode<T> {

    public Node<T> findMiddleNode(LinkedList<T> linkedList) {
        //define two pointers
        //have one leading fast pointr to go before the slow one
        //at the end of the loop, the slow loop will be at the middle

        Node<T> fast = linkedList.getHead();
        Node<T> slow = linkedList.getHead();
        while (fast != null) {
            fast = fast.getNext();
            if (fast != null) {
                fast = fast.getNext();
                slow = slow.getNext();
            }
        }
        return slow;

    }
}
