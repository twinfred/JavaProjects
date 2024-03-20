package DataStructures.Graphs.ShortestPath;

import java.util.*;

public class ShortestPath {
    Integer[][] gameMap = {
        { 0, 1, 1, 1, 1, 1, 1, 1 },
        { 0, 0, 0, 1, 1, 1, 1, 1 },
        { 0, 1, 0, 0, 0, 0, 0, 1 },
        { 0, 1, 1, 0, 1, 1, 0, 1 },
        { 1, 0, 0, 0, 0, 0, 0, 1 },
        { 1, 0, 1, 1, 1, 1, 1, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 2 },
    };
    public static void main(String[] args) {
        Queue<LocationNode> nodesToExploreNext = new LinkedList<>();
        HashSet<LocationNode> visitedNodes = new HashSet<>();

        visitedNodes.add(new LocationNode(0, 0));
        nodesToExploreNext.add(new LocationNode(0,1));
        nodesToExploreNext.add(new LocationNode(1,0));

        while (!nodesToExploreNext.isEmpty()) {
            LocationNode node = nodesToExploreNext.poll();

            if (visitedNodes.contains(node)) {
                System.out.println("Node found");
            }
        }
    }
}
