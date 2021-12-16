public class GeoPosition {
    double longitude;
    double latitude;

    public GeoPosition(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "GeoPosition{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
    Position toPosition() {
        int x = (int)((longitude-PositionTransformer.basePosition.longitude)/PositionTransformer.unit);
        int y = (int)((latitude-PositionTransformer.basePosition.latitude)/PositionTransformer.unit);
        return new Position(x,y);
    }
}
