package LinkedLists;

import java.util.HashMap;
import java.util.Map;

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

    public void swapNodes(LinkedList<T>linkedList , T data1, T data2){
        Node<T>node1 = linkedList.head;
        Node<T>node2 = linkedList.head;
        Node<T>node1Prev = null;
        Node<T>node2Prev = null;

       Map<String, Node<T>>map1 = findPrevAndNode(linkedList, data1, node1);
        Map<String, Node<T>>map2 = findPrevAndNode(linkedList, data2, node2);
        node1 = map1.get("node");
        node1Prev = map1.get("prev");
        node2 = map2.get("prev");
        node2Prev = map2.get("node");

        if(node1Prev == null){
            this.head = node2;

        }else{
            node1Prev.setNext(node2);
        }
        if(node2Prev == null){
            this.head = node1;
        }else{
            node2Prev.setNext(node1);
        }


    }

    public Map<String, Node<T>>findPrevAndNode(LinkedList<T>linkedList, T data, Node<T>node){
        Node<T>prev = null;
        Node<T>node1 = null;
        while(node.getNext()!=null){
            if(node.getData() == data){
                break;
            }
            prev = node;
            node1 = node.getNext();

        }
        Map<String, Node<T>>newMap = new HashMap<>();
        newMap.put("prev", prev);
        newMap.put("node", node1);
        return newMap;
    }

}

