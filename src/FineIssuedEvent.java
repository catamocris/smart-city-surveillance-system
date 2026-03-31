public class FineIssuedEvent {

    private final String name;
    private final String neighborhood;

    public FineIssuedEvent(String name, String neighborhood) {
        this.name = name;
        this.neighborhood = neighborhood;
    }

    public String getName() { return name; }
    public String getNeighborhood() { return neighborhood; }
}
