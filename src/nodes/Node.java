package nodes;

import java.util.List;

public class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setNext(Node<T>next){
        this.next = next;
    }

    public void iterateThoughNodes(){
        Node<String> node1 =  new Node<>("Node 1");
        Node<String>node2 = new Node<>("Node 2");
        Node<String>node3 = new Node<>("Node 3");

        node1.setNext(node2);
        node2.setNext(node3);

        Node<String>currentNode = node1;
        while (currentNode != null){
            System.out.println("Current node is here :"+currentNode.getData());
            currentNode = currentNode.getNext();

        }



    }
}
