import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathPlanner {
    private UAV uav;
    private Task task;
    private ArrayList<Position> wayPointList;
    private List<GeoPosition> geoWayPointList;
    private Position currentPosition;
    double cost;

    public PathPlanner(UAV uav, Position currentPosition, Task task) {
        this.uav = uav;
        this.task = task;
        this.currentPosition = currentPosition;
        wayPointList = new ArrayList<Position>();
        geoWayPointList = new ArrayList<GeoPosition>();
        assert uav != null;
        cost = 0;
    }
    int plan(){
        ArrayList<Position> points = new ArrayList<Position>();
        for (TaskPoint tp : task.taskPointsList) {
            points.add(tp.geoPosition.toPosition());
        }
        return -1;
    }

    int pathSearch(Position start) {

        wayPointList.add(start);
        Stack<Position> s = new Stack<Position>();
        s.push(start);
        while (!s.empty()) {
            Position w = s.pop();
        }

        return -1;
    }

    void pathSmooth() {

    }

}
