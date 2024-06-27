package LinkedLists;


public class DoublyLinkedList <T>{
    private Node<T>head;
    private Node<T>tail;

    public DoublyLinkedList(){
     this.head = null;
     this.tail = null;
    }
   public void addToHead(T data){
        Node<T>newNode = new Node<>(data);
        Node<T>oldHead = this.head;

        this.head = newNode;

        if(tail == null){
            this.tail = newNode;
        }else{
            newNode.setNext(oldHead);
            oldHead.setPrevious(newNode);
        }
   }

   public void addToTail(T data){
        Node<T>newNode = new Node<>(data);
        Node<T>oldTail = this.tail;

        this.tail = newNode;
        if(head == null){
            this.head = newNode;
        }else{
            oldTail.setNext(newNode);
            newNode.setPrevious(oldTail);
        }

   }

   public Node<T>removeHead(){
        Node<T>removedNode = this.head;
        if(removedNode == null){
            return null;
        }else{
            this.head = removedNode.getNext();
            if(this.head!=null) {
                this.head.setPrevious(null);
            }
            removedNode.setNext(null);
        }
        if(removedNode == this.tail){
            removeTail();
        }
        return removedNode;
   }

   public Node<T>removeTail(){
        Node<T>removedNode = this.tail;
        if(removedNode ==null){
            return null;
        }else{
            this.tail = removedNode.getPrevious();
            if(this.tail != null){
                this.tail.setNext(null);
            }
            removedNode.setPrevious(null);
        }
        if(removedNode == this.head){
            removeHead();
        }
        return null;
   }

   public Node<T>deleteDataByPosition(DoublyLinkedList<T>linkedList, int position){
        int count = 0;
        Node<T>currentNode = linkedList.head;
        Node<T>previousNode = null;

        if(currentNode == null){
            return null;
        }

        while(currentNode!=null){
            if(count == position){
                if(previousNode!=null){
                    previousNode.setNext(currentNode.getNext());
                }
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                return currentNode;

            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            count++;
        }

    return null;

   }

   public void swapNodes(LinkedList<T>linkedList, T data1, T data2){
        Node<T>node1 = findNode(linkedList, data1);
        Node<T>node2 = findNode(linkedList, data2);

        if(node1!=null && node2!=null){
            node2.setPrevious(node1.getPrevious());
            node2.setNext(node1.getNext());
            node1.setNext(node2.getNext());
            node2.setPrevious(node1.getPrevious());
        }



   }
   private Node<T> findNode(LinkedList<T>linkedList, T data){
        Node<T>current = linkedList.getHead();
        while(current.getNext() !=null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNext();
        }
        return null;
   }
}
