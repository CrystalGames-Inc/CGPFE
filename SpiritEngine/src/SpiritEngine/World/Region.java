package SpiritEngine.World;

public class Region extends Location{

    private String name;
    private Location[] locations;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public Location[] getLocations() {
        return locations;
    }
}
