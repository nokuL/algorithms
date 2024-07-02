package LinearAlgs;

public class PartitionList<T extends Comparable<T>> {

    public Node<T> partitionList(LinkedList<T>linkedList, T num) {
        //create two dummy nodes to kep track of start of left and right
        //create two pointer nodes to iterate through
        //for each node....check if less than
        //if lesss, let low. next = curr, then set low to curr
        //if greater, let high.next = curr , then set high to curr
        //curr = curr.next
        //low.next = d2.next
        //high.next = null
        //return d1.next which is the head
        //
        Node<T>node1 = new Node<>();
        Node<T>node2 = new Node<>();
        Node<T>left = node1;
        Node<T>right = node2;
        Node<T>current = linkedList.getHead();
        while(current != null){
            if(current.getData() != null && current.getData().compareTo(num)<0){
                left.setNext(current);
                left = current;
            }else{
                right.setNext(current);
                right = current;
            }
            current = current.getNext();
        }
        left.setNext(node2.getNext());
        right.setNext(null);
        return node1.getNext();


    }
}
