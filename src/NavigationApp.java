import org.greenrobot.eventbus.Subscribe;

public class NavigationApp {

    public final String name;

    public NavigationApp(String name) {
        this.name = name;
    }

    @Subscribe
    public void onTrafficCongestionEvent(TrafficCongestionEvent event) {
        System.out.println(name + " - Traffic congestion reported"
                + " | Street: " + event.getStreet()
                + " | Neighborhood: " + event.getNeighborhood()
                + " | Camera: " + event.getCameraId());
    }
}
