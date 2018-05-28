package ejercicioshackerearth;

public class Node {

    int value;

    public Node next;

    public Node() {};

    public Node(int value) {
        this.value = value;
    }
    
    public Node clone() {
        return new Node(value);
    }
    
}
