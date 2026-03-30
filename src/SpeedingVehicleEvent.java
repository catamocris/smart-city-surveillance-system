public class SpeedingVehicleEvent {

    private final String cameraId;
    private final String neighborhood;
    private final String street;
    private final int speedLimit;
    private final String licensePlate;
    private final int speed;

    public SpeedingVehicleEvent(String cameraId,
                                String neighborhood,
                                String street,
                                int speedLimit,
                                String licensePlate,
                                int speed) {
        this.cameraId = cameraId;
        this.neighborhood = neighborhood;
        this.street = street;
        this.speedLimit = speedLimit;
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    public String getCameraId() { return cameraId; }
    public String getNeighborhood() { return neighborhood; }
    public String getStreet() { return street; }
    public int getSpeedLimit() { return speedLimit; }
    public String getLicensePlate() { return licensePlate; }
    public int getSpeed() { return speed; }
}
