package DataStructures.Graphs.ShortestPath;

import java.util.ArrayList;
import java.util.List;

public class LocationNode {
    List<Integer> location = new ArrayList<>();
    List<LocationNode> previousNodes;
    public LocationNode(Integer rowIdx, Integer colIdx) {
        location.add(rowIdx);
        location.add(colIdx);
    }

    public List<Integer> getLocation() {
        return location;
    }

    public void setPath(List<LocationNode> path) {
        previousNodes = path;
    }

    public Integer getPathLength() {
        return previousNodes.size();
    }
}
