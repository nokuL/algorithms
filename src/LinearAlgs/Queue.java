package LinearAlgs;

public class Queue<T> {
    private int size;
    private int maxSize;

    private LinkedList<T>queue;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.queue = new LinkedList<>();

    }

    public T enqueue(T data) throws IllegalStateException {
        if(this.hasRoom()){
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added "+ data);
            return data;
        }else{
            throw new IllegalStateException("Queue is full");
        }

    }

    public T dequeue() throws IllegalStateException{
             if(this.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            T data = this.queue.removeHead();
            this.size--;
            return data;

        }

    }
    public boolean hasRoom(){
        return this.size < this.maxSize;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
