import org.greenrobot.eventbus.EventBus;

public class MainSmartCity {

    public static void main(String[] args) {

        EventBus eventBus = EventBus.getDefault();

        // subscribers
        TrafficPolice trafficPolice = new TrafficPolice("Traffic Police");
        LocalPolice localPolice = new LocalPolice("Local Police");
        NavigationApp googleMaps = new NavigationApp("Google Maps");
        NavigationApp waze = new NavigationApp("Waze");
        CityDashboard cityDashboard = new CityDashboard();

        eventBus.register(trafficPolice);
        eventBus.register(localPolice);
        eventBus.register(googleMaps);
        eventBus.register(waze);
        eventBus.register(cityDashboard);

        // publishers
        TrafficCamera trafficCamera1 = new TrafficCamera(eventBus, "TC01", "Centru", "Bulevardul Ion C. Bratianu");
        TrafficCamera trafficCamera2 = new TrafficCamera(eventBus, "TC02", "Aradului", "Calea Aradului");
        TrafficCamera trafficCamera3 = new TrafficCamera(eventBus, "TC03", "Circumvalatiunii", "Calea Circumvalatiunii");
        TrafficCamera trafficCamera4 = new TrafficCamera(eventBus, "TC04", "Sagului", "Calea Sagului");

        SpeedCamera speedCamera1 = new SpeedCamera(eventBus, "SC01", "Centru", "Bulevardul Ion C. Bratianu", 50);
        SpeedCamera speedCamera2 = new SpeedCamera(eventBus, "SC02", "Aradului", "Calea Aradului", 50);
        SpeedCamera speedCamera3 = new SpeedCamera(eventBus, "SC03", "Circumvalatiunii", "Strada Gheorghe Lazar", 50);
        SpeedCamera speedCamera4 = new SpeedCamera(eventBus, "SC04", "Sagului", "Calea Sagului", 60);
        SpeedCamera speedCamera5 = new SpeedCamera(eventBus, "SC04", "Sagului", "Strada Ana Ipatescu", 30);

        PublicSurveillanceCamera publicSurveillanceCamera1 = new PublicSurveillanceCamera(eventBus, "PSC01", "Centru", "Piata Unirii");
        PublicSurveillanceCamera publicSurveillanceCamera2 = new PublicSurveillanceCamera(eventBus, "PSC02", "Centru", "Parcul Central");
        PublicSurveillanceCamera publicSurveillanceCamera3 = new PublicSurveillanceCamera(eventBus, "PSC03", "Dacia", "Parcul Dacia");

        // simulation
        trafficCamera1.detectTrafficCongestion();
        speedCamera3.detectSpeedingVehicle("TM01ABC", 57);
        speedCamera5.detectSpeedingVehicle("TM23BCD", 40);
        publicSurveillanceCamera3.detectGarbageThrowing();
        trafficCamera2.detectTrafficCongestion();
        speedCamera2.detectSpeedingVehicle("TM34CDE", 60);
        publicSurveillanceCamera2.detectGarbageThrowing();
        trafficCamera3.detectTrafficCongestion();
        speedCamera4.detectSpeedingVehicle("TM99XYZ", 77);
        speedCamera1.detectSpeedingVehicle("TM88AAA", 55);
        trafficCamera4.detectTrafficCongestion();
        publicSurveillanceCamera1.detectGarbageThrowing();
    }
}
