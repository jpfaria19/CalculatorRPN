package infnet.gads.joaolfaria.calculadorarpn;

public class Node<T> {

    private T value;
    public Node<T> next = null;

    public Node(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public Node<T> getNext(){
        return next;
    }

}
