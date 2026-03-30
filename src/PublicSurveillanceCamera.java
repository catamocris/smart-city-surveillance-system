import org.greenrobot.eventbus.EventBus;

public class PublicSurveillanceCamera {

    private final EventBus eventBus;
    private final String id;
    private final String neighborhood;
    private final String location;

    public PublicSurveillanceCamera(EventBus eventBus,
                                    String id,
                                    String neighborhood,
                                    String location) {
        this.eventBus = eventBus;
        this.id = id;
        this.neighborhood = neighborhood;
        this.location = location;
    }

    public void detectGarbageThrowing() {
        GarbageThrowingEvent event = new GarbageThrowingEvent(id, neighborhood, location);
        eventBus.post(event);
    }
}
