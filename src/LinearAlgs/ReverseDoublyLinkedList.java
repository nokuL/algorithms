package LinearAlgs;

public class ReverseDoublyLinkedList <T>{

    public Node<T>reverseDoublyLinkedList(DoublyLinkedList<T>doublyLinkedList){
        Node<T>prev = null;
        Node<T>current = doublyLinkedList.getHead();
        while(current!=null){
            prev = current.getPrevious();
            current.setNext(prev);
            current.setPrevious(current.getNext());
            current = current.getPrevious();
        }
        assert prev != null;
        return  prev.getPrevious();

    }
}
