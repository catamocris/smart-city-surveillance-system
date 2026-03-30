import org.greenrobot.eventbus.Subscribe;

public class LocalPolice {

    private final String name;

    public LocalPolice(String name) {
        this.name = name;
    }

    @Subscribe
    public void onGarbageThrowingEvent(GarbageThrowingEvent event){
        System.out.println(name + " - Garbage throwing fine"
                + " | Location: " + event.getLocation()
                + " | Neighborhood: " + event.getNeighborhood()
                + " | Camera: " + event.getCameraId());
    }
}
