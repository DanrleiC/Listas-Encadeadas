package listasencadeadas;

public class Node{
    public Node next;
    public Object value;

    public Node(Node next, Object value) {
        this.next = next;
        this.value = value;
    }

    public Node() {
    }
} 