import java.util.ArrayList;

public class UAVManager {
    private static final UAVManager uavManager = new UAVManager();
    static UAVManager getInstance(){
        return uavManager;
    }
    private ArrayList<UAV> uavList;
    ArrayList<UAV> getUAVs(){
        return uavList;
    }
}