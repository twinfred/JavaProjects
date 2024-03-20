package DataStructures.Graphs.ShortestPath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LocationNode {
    private final Integer row;
    private final Integer column;
    List<LocationNode> pathTaken;
    public LocationNode(Integer rowIdx, Integer colIdx) {
        this.row = rowIdx;
        this.column = colIdx;
    }

    public void setPathTaken(List<LocationNode> path) {
        pathTaken = path;
    }

    public Integer getPathLength() {
        return pathTaken.size();
    }
}
