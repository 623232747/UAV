public class Position {
    // 栅格化坐标
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    GeoPosition toGeo() {
        double longitude = (double)(x*PositionTransformer.unit+ PositionTransformer.basePosition.longitude);
        double latitude = (double)(y*PositionTransformer.unit+ PositionTransformer.basePosition.latitude);
        return new GeoPosition(longitude,latitude);
    }
}
