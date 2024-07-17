package LinearAlgs;

public class ReverseLinkedList<T> {

    public Node<T>reverseLinkedList(Node<T>node){
      Node<T>prev = null;
      Node<T>next = null;
      Node<T>curr = node;
      while(curr!=null){
          next = curr.getNext();
          curr.setNext(prev);
          prev = curr;
          curr= next;

      }
      node = prev;
      return  node;

    }
}
