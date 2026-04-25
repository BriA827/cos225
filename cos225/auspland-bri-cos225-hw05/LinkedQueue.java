public class LinkedQueue<T> implements Queue<T> {
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size = 0;

    //O(1)
    public void enqueue(T element) {
        if (head == null){
            head = new LinkedNode<T>(element);
            tail = head;
        }
        else{
            tail.setNext(new LinkedNode<T>(element));
            tail = tail.getNext();
            //LinkedNode<T> temp = head;
            //while (temp.getNext() != null){  //<----
            //    temp = temp.getNext();
            //}
            //temp.setNext(new LinkedNode<T>(element));
        }
        size++;
    }

    //O(1)
    public T dequeue() {
        if (head == null){
            return null;
        }
        else if (head == tail){
            T temp = head.getElement();
            head = null;
            tail = null;
            size = 0;
            return temp;
        }
        else{
            T temp = head.getElement();
            head = head.getNext();
            size--;
            return temp;
        }
    }

    //O(1)
    public T getFront() {
        if (head != null) return head.getElement();
        else return null;
    }

    //O(1)
    public boolean isEmpty() {
        return size == 0;
    }   

    //O(1)
    public int size() {
        return size;
        /*
        if (this.isEmpty()) return 0;
        int size = 1;
        LinkedNode<T> temp = head;
        while (temp.getNext() != null){  //<---
            temp = temp.getNext();
            size++;  //size+=1
        }
        return size; */
    }
}
