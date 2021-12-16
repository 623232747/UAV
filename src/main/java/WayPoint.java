public class WayPoint implements Move {
    GeoPosition wayPoint;
    public void move(){
        System.out.println("移动到"+wayPoint.toString());
    }
    public WayPoint(GeoPosition watpoint) {
        this.wayPoint = watpoint;
    }
}
