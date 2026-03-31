import org.greenrobot.eventbus.Subscribe;

import java.util.HashMap;
import java.util.Map;

public class CityDashboard {

    private int speedingFines;
    private int garbageFines;
    private final Map<String, Integer> neighborhoodFines;

    public CityDashboard(){
        this.speedingFines = 0;
        this.garbageFines = 0;
        neighborhoodFines = new HashMap<>();
    }

    private void printDashboard(){
        int max = 0;

        for(int value : neighborhoodFines.values()) {
            if(value > max) {
                max = value;
            }
        }

        System.out.println();
        System.out.println("---------- City Dashboard ----------");
        System.out.println("Speeding fines : " + speedingFines);
        System.out.println("Garbage fines  : " + garbageFines);

        System.out.println("Most dangerous neighborhood(s):");
        for(Map.Entry<String, Integer> entry : neighborhoodFines.entrySet()) {
            if(entry.getValue() == max) {
                System.out.println("\t" + entry.getKey() + " - incidents: " + entry.getValue());
            }
        }
        System.out.println();
    }

    @Subscribe
    public void onFineIssuedEvent(FineIssuedEvent event) {
        speedingFines++;
        neighborhoodFines.merge(event.getNeighborhood(), 1, Integer::sum);
        printDashboard();
    }

    @Subscribe
    public void onGarbageThrowingEvent(GarbageThrowingEvent event) {
        garbageFines++;
        neighborhoodFines.merge(event.getNeighborhood(), 1, Integer::sum);
        printDashboard();
    }
}
