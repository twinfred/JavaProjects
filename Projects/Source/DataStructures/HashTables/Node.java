package DataStructures.HashTables;

public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void display() {
        if (this.value == null && this.next == null) {
            System.out.println("This Node is null");
            return;
        }

        System.out.println(String.format("This Node's value is %s", this.value));

        if (this.next != null) {
            System.out.println(String.format("This Node's next Node's value is %s", this.next.getValue()));
        }
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        if (this.value != null) {
            return this.value;
        }

        return null;
    }

    public Node getNext() {
        if (this.next != null) {
            return this.next;
        }

        return null;
    }
}
