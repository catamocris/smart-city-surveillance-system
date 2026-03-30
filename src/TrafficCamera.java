import org.greenrobot.eventbus.EventBus;

public class TrafficCamera {

    private final EventBus eventBus;
    private final String id;
    private final String neighborhood;
    private final String street;

    public TrafficCamera(EventBus eventBus,
                         String id,
                         String neighborhood,
                         String street) {
        this.eventBus = eventBus;
        this.id = id;
        this.neighborhood = neighborhood;
        this.street = street;
   }

    public void detectTrafficCongestion() {
        TrafficCongestionEvent event = new TrafficCongestionEvent(id, neighborhood, street);
        eventBus.post(event);
    }
}
