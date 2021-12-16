
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

public class Map {
    private static final Map map = new Map();

    static Map getInstance() {
        return map;
    }

//    private List<Danger> dangerList;
    private ArrayList<ArrayList<Integer>> mmap;

    public Map() {
        System.out.println("正在加载天气数据");
        System.out.println("正在加载地形数据");
        System.out.println("地图初始化完毕");
        mmap=new ArrayList<ArrayList<Integer>>();
        try {
            String fileName = "D:\\D\\UAV\\src\\main\\resources\\map.txt";
            File file = new File(fileName);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    for(String s : lineTxt.split(" ")){
//                        System.out.println("1");
                        int i = Integer.parseInt(s);
                        list.add(i);
                    }
                    mmap.add(list);
                }
                System.out.println(mmap.size());
                bufferedReader.close();
                read.close();
            }
            else{
                System.out.println("Warning! 文件不存在！");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int dangerLevel(Position p) {
        return mmap.get(p.x).get(p.y);
    }

//    public static void main(String[] args) {
//        Map map = Map.getInstance();
//    }
}
