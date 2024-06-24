package LinkedLists;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;

    }

    public void addToHead(T data) {
        Node<T> newHead = new Node<>(data);
        Node<T> currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNext(currentHead);
        }
    }

    public void addToTail(T data) {
        Node<T> newNode = new Node(data);
        Node<T> tail = this.head;
        if (tail == null) {
            this.head = newNode;
        } else {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(newNode);
        }
    }

    public T removeHead(){
        if(this.head == null){
            return null;
        }
        Node<T>removedHead = this.head;
        this.head = removedHead.getNext();

        return removedHead.getData();

    }
    public void printList(){
        Node<T>currentNode = this.head;
        StringBuilder output = new StringBuilder();
        output.append("<head>");
        while(currentNode.getNext()!=null){
            output.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        output.append("<tail>");
        System.out.println(output);
    }

}

