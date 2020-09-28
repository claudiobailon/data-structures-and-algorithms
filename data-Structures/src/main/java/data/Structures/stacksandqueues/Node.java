package data.Structures.stacksandqueues;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = next;
    }
    @Override
    public String toString() {
        return String.format("{%d}", this.value);
    }
}
