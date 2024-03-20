package DataStructures.HashTables;

public class HashMap {
    private Node[] hashMap = new Node[5];
    public HashMap() {}

    public void display() {
        for (int i = 0; i < hashMap.length; i++) {
            Node node = hashMap[i];
            if (node != null) {
                System.out.println(String.format("The values for index %s", i));
                Node current = node;
                while (current.getNext() != null) {
                    System.out.println(String.format("Value: %s", current.getValue()));
                    current = current.getNext();
                }
                System.out.println(String.format("Value: %s", current.getValue()));
            }
        }
    }

    public Node addNode(Node node) {
        int nodeIdx = getHashMapIndex(node, hashMap);
        if (hashMap[nodeIdx] == null) {
            hashMap[nodeIdx] = node;
            return node;
        }

        Node current = hashMap[nodeIdx];
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);

        return node;
    }

    private static int getHashMapIndex(Node node, Node[] hashMap) {
        return Math.abs(node.getValue().hashCode() % hashMap.length);
    }
}
