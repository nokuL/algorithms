package LinearAlgs;

import java.util.HashSet;

public class DeleteDupsFromLinkedList<T> {

    public void deleteDups(LinkedList<T> linkedList){
        HashSet<Node<T>>hashSet = new HashSet<>();
        Node<T> currentNode = linkedList.getHead();
        Node<T> prevNode = null;

        if(currentNode == null){
            return;
        }

        while(currentNode!=null){
            if(hashSet.contains(currentNode)){
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
