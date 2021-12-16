import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;

public class TaskManager {
    static final private TaskManager taskManager = new TaskManager();
    static private TaskManager getInstance() {
        return taskManager;
    }
    ArrayList<Task> tasks;

    private void calculateCostMatrix(){
        for(Task task:tasks){
            for (UAV uav: UAVManager.getInstance().getUAVs()) {
                PathPlanner pathPlanner = new PathPlanner(uav,uav.pos.toPosition(),task);
                pathPlanner.plan();
            }
        }
    }
    private int search(){
        for (Task task:tasks){
            task.executor=new ArrayList<UAV>();

        }
        return -1;
    }

    public int allocateTask(ArrayList<Task> tasks){
        this.tasks = tasks;
        calculateCostMatrix();
        return search();
    }
}
