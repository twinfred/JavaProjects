package DataStructures.Tree;

import java.util.HashMap;
import java.util.Map;

public class FolderFileNode {
    String name;
    String url;
    Map<String, FolderFileNode> children;

    public FolderFileNode(String name) {
        this.name = name;
        this.url = null;
        this.children = new HashMap<>();
    }

    public FolderFileNode addChild(String childName) {
        if (!children.containsKey(childName)) {
            FolderFileNode childNode = new FolderFileNode(childName);
            children.put(childName, childNode);
            return childNode;
        }

        return children.get(childName);
    }
}
