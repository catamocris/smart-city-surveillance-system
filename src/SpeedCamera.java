import org.greenrobot.eventbus.EventBus;

public class SpeedCamera {

    private final EventBus eventBus;
    private final String id;
    private final String neighborhood;
    private final String street;
    private final int speedLimit;

    public SpeedCamera(EventBus eventBus,
                       String id,
                       String neighborhood,
                       String street,
                       int speedLimit) {
        this.eventBus = eventBus;
        this.id = id;
        this.neighborhood = neighborhood;
        this.street = street;
        this.speedLimit = speedLimit;
    }

    public void detectSpeedingVehicle(String licensePlate, int speed) {
        SpeedingVehicleEvent event = new SpeedingVehicleEvent(id, neighborhood, street, speedLimit, licensePlate, speed);
        eventBus.post(event);
    }
}
