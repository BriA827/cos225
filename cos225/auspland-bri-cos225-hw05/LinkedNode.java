public class LinkedNode<T> {
    private T element;
    private LinkedNode<T> next;

    public LinkedNode(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }

    public void setElement(T element){
        this.element = element;
    }

    public LinkedNode<T> getNext(){
        return next;
    }

    public void setNext(LinkedNode<T> next){
        this.next = next;
    }
    
}
