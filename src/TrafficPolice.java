import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import java.util.Random;

public class TrafficPolice {

    private final EventBus eventBus;
    private final String name;

    public TrafficPolice(EventBus eventBus, String name) {
        this.eventBus = eventBus;
        this.name = name;
    }

    @Subscribe
    public void onSpeedingVehicleEvent(SpeedingVehicleEvent event) {
        Random r = new Random();
        int random = r.nextInt(2);
        if(random == 1) return;

        int exceededBy = event.getSpeed() - event.getSpeedLimit();
        System.out.println(name + " - Speeding fine"
                + " | License plate: " + event.getLicensePlate()
                + " | Speed: " + event.getSpeed()
                + " | Limit: " + event.getSpeedLimit()
                + " | Exceeded by: " + exceededBy
                + " | Street: " + event.getStreet()
                + " | Neighborhood: " + event.getNeighborhood()
                + " | Camera: " + event.getCameraId());
        FineIssuedEvent fineIssuedEvent = new FineIssuedEvent(name, event.getNeighborhood());
        eventBus.post(fineIssuedEvent);
    }
}
