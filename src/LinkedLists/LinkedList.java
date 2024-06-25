package LinkedLists;

import java.util.HashMap;
import java.util.Map;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;

    }

    public Node<T>getHead(){
        return this.head;
    }

    public void addToHead(T data) {
     Node<T>newHead = new Node<>(data);
     Node<T>oldHead = this.head;
     this.head = newHead;
     if(oldHead!=null){
         this.head.setNext(oldHead);
     }

    }

    public void addToTail(T data) {
      Node<T>newNode = new Node<>(data);
      Node<T>tail = this.head;
      if(tail == null){
          this.head = newNode;
      }else{
          while(tail.getNext()!=null){
              tail = tail.getNext();
          }
          tail.setNext(newNode);

      }
    }

    public T removeHead(){
        if(this.head == null){
            return null;
        }
        Node<T>nodeToRemove = this.head;

        this.head = nodeToRemove.getNext();
        return nodeToRemove.getData();


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
       Node<T>prevNode1 = null;
       Node<T>prevNode2 = null;

       Map<String, Node<T>>map1 = findPrevAndNode(data1, node1 );
        Map<String, Node<T>>map2 = findPrevAndNode(data2, node2 );

        prevNode1 = map1.get("prev");
       node1 = map1.get("node");
       prevNode2 = map2.get("prev");
       node2 = map2.get("node");

       if(data1 == null || data2==null){
           System.out.println("Data is null &&& nothing to swap ");
           return;
       }

       //setting next node for prevnodes

       if(prevNode1== null){
           this.head = node2;
       }else{
           prevNode1.setNext(node2);
       }
       if(prevNode2==null){
           this.head = node1;
       }else{
           prevNode2.setNext(node1);
       }

       //setting next node for current nodes

        Node<T>nodeTemp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(nodeTemp);


    }

    private Map<String, Node<T>>findPrevAndNode(T data, Node<T>node){
        Map<String, Node<T>>map = new HashMap<>();
        Node<T>prevNode = null;
        Node<T>node1 = null;
        while(node.getNext()!=null){
            if(node.getData()==data){
                break;
            }
            prevNode = node;
            node1 = node.getNext();


        }
        map.put("prev", prevNode);
        map.put("node", node1);
        return map;


    }

    public Node<T> deleteNode(T data) {
        Node<T> n = this.head;
        if (n.getData() == data) {
            this.head = n.getNext(); //moving head if the data is found in the head
            return n;
        }
        //if data is not found in head
        while (n.getNext() != null) {
            if (n.getNext().getData() == data) {
                n.setNext(n.getNext().getNext());
                return head;

            }
            n = n.getNext();
        }
      return head;

    }

}

