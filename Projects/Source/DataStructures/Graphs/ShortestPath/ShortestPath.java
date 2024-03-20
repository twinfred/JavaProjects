package DataStructures.Graphs.ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<LocationNode> nodesToExploreNext = new ArrayList<>();
        List<LocationNode> visited = new ArrayList<>();

        visited.add(new LocationNode(0, 0));
        nodesToExploreNext.add(new LocationNode(0,1));
        nodesToExploreNext.add(new LocationNode(1,0));

        while (!nodesToExploreNext.isEmpty()) {
            LocationNode node = nodesToExploreNext.removeFirst();

            if (!visited.contains(node)) {
                node.setPath(visited);
                visited.add(node);
            }

            if (node.getLocation() == Arrays.asList(7,7)) {
                System.out.println("Shortest path found in " + node.getPathLength() + " steps.");
            }
        }
    }
}
