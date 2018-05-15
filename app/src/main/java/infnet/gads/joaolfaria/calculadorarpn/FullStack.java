package infnet.gads.joaolfaria.calculadorarpn;

public class FullStack<T> {

    private Node<T> top = null;

    public FullStack(){ }

    public FullStack(T singleValue){ }

    public FullStack(T[] incomeValues){
        for (T value: incomeValues){
            push(value);
        }
    }

    public void push(T value){
        if (top == null){
            Node<T> node = new Node<T>(value);
            top = node;
        }else{
            Node<T> node = new Node<T>(value);
            node.next = top;
            top = node;
        }
    }

    public T pop(){
        if (top != null){
            Node<T> node = top;
            top = top.next;
            return node.getValue();
        }
        return null;
    }
}
