import java.util.List;

public class Danger {
    // 奇怪的转化类？没用
    private List<Position> conner;
    private int level;

    private double cross(Position a, Position b, Position p) {
        return (b.x - a.x) * (p.y - a.y) - (b.y - a.y) * (p.x - a.x);
    }

    int isDanger(Position p) {
        double a =  cross(conner.get(conner.size()-1), conner.get(0), p);
        for (int i = 0; i < conner.size(); i++) {
            a = a * cross(conner.get(i), conner.get(i + 1), p);
            if (a<0) return 0;
        }
        return level;
    }
}
