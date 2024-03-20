package DataStructures.Tree;

public class FolderFileTreeSimulator {
    public static void main(String[] args) {
        FolderFileTree tree = new FolderFileTree();
        tree.addPath("src/page/index.html", "https://site.static.com/index.html");
        tree.addPath("src/page/about.html", "https://site.static.com/about.html");
        tree.addPath("src/page/portfolio/project1.html", "https://site.static.com/project1.html");
        tree.addPath("src/page/portfolio/project2.html", "https://site.static.com/project2.html");
        tree.addPath("src/page/experience/job1.html", "https://site.static.com/job1.html");
        tree.addPath("src/page/experience/job2.html", "https://site.static.com/job2.html");

        tree.printTree();
    }
}
