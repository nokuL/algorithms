package LinkedLists;

import java.util.HashSet;

public class DeleteDupsFromLinkedList<T> {

    public void deleteDups(LinkedList<T> linkedList){
        HashSet<Node<T>>hashSet = new HashSet<>();
        Node<T> currentNode = linkedList.getHead();
        Node<T> prevNode = null;

        while(currentNode.getNext()!=null){
            if(hashSet.contains(currentNode.getData())){
                try{
                    prevNode.setNext(currentNode.getNext());

                }catch (NullPointerException e){
                    System.out.println("Null pointer "+ e);
                }
            }else{
                hashSet.add(currentNode);
                prevNode = currentNode;

            }

            currentNode = currentNode.getNext();
        }

    }
}
