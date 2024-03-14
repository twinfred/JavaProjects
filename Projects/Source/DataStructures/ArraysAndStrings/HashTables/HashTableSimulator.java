package DataStructures.ArraysAndStrings.HashTables;

public class HashTableSimulator {
    public static void main(String[] args) {
        String[] nodeValuesTest = new String[]{"apple", "banana", "peanut", "tea", "coffee", "pizza", "bread", "soda", "pineapple", "latte", "pear", "snow", "rain", "wind", "hail", "clouds"};

        HashMap hashMap = new HashMap();
        for(String value : nodeValuesTest) {
            Node node = new Node(value);
            hashMap.addNode(node);
        }
        hashMap.display();
    }
}
