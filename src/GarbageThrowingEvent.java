public class GarbageThrowingEvent {

    private final String cameraId;
    private final String neighborhood;
    private final String location;

    public GarbageThrowingEvent(String cameraId,
                                String neighborhood,
                                String location) {

        this.cameraId = cameraId;
        this.neighborhood = neighborhood;
        this.location = location;
    }

    public String getCameraId() { return cameraId; }
    public String getNeighborhood() { return neighborhood; }
    public String getLocation() { return location; }
}
