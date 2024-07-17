package LinearAlgs.exchangeNodes;

import LinearAlgs.LinkedList;
import LinearAlgs.Node;

public class ExchangeNode<T> {

    public Node<T> getExchangedNodes(LinkedList<T>linkedList){
        Node<T> curr = linkedList.getHead();
        Node<T>initialHead = linkedList.getHead();
        Node<T>prev = null;
        while(curr !=null && curr.getNext() != linkedList.getHead()){
            prev = curr;
            curr = curr.getNext();
        }

        //set prev.next = head
        if(prev!=null) {
            linkedList.setHead(prev.getNext());
            prev.setNext(initialHead);
        }
        return linkedList.getTail();

    }
}
