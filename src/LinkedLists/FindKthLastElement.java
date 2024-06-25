package LinkedLists;

public class FindKthLastElement<T>{

    public  Node<T> findKthLastElement(LinkedList<T>linkedList, int n){
        int count = 0;
        Node<T>current = null;
        Node<T>tailseeker = linkedList.getHead();

        while(tailseeker != null){
            tailseeker = tailseeker.getNext();
            if(count>=n){
                if(current== null){
                    current = linkedList.getHead();
                }
                current = current.getNext();
            }
            count++;


        }
        return current;


    }
}
