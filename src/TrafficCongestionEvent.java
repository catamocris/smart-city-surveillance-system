public class TrafficCongestionEvent {

    private final String cameraId;
    private final String neighborhood;
    private final String street;

    public TrafficCongestionEvent(String cameraId,
                                  String neighborhood,
                                  String street) {
        this.cameraId = cameraId;
        this.neighborhood = neighborhood;
        this.street = street;
    }

    public String getCameraId() { return cameraId; }
    public String getNeighborhood() { return neighborhood; }
    public String getStreet() { return street; }
}
