import org.greenrobot.eventbus.Subscribe;

public class TrafficPolice {

    private final String name;

    public TrafficPolice(String name) {
        this.name = name;
    }

    @Subscribe
    public void onSpeedingVehicleEvent(SpeedingVehicleEvent event) {
        int exceededBy = event.getSpeed() - event.getSpeedLimit();
        System.out.println(name + " - Speeding fine"
                + " | License plate: " + event.getLicensePlate()
                + " | Speed: " + event.getSpeed()
                + " | Limit: " + event.getSpeedLimit()
                + " | Exceeded by: " + exceededBy
                + " | Street: " + event.getStreet()
                + " | Neighborhood: " + event.getNeighborhood()
                + " | Camera: " + event.getCameraId());
    }
}
