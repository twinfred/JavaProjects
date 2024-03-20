package DataStructures.Tree;

public class FolderFileTree {
    private FolderFileNode root;
    public FolderFileTree() {
        root = new FolderFileNode("");
    }

    public void addPath(String path, String url) {
        String[] parts = path.split("/");
        FolderFileNode current = root;
        for(String part : parts) {
            current = current.addChild(part);
        }

        current.url = url;
    }

    public void printTree() {
        printTreeNode(root, 0);
    }

    private void printTreeNode(FolderFileNode node, int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(node.name + (node.url != null ? " (" + node.url + ")" : ""));

        for(FolderFileNode child: node.children.values()) {
            printTreeNode(child, depth + 1);
        }
    }
}
