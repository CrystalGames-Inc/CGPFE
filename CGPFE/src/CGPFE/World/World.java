package CGPFE.World;

public class World {

    String name;

    Region[] regions;
    Location[] locations;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public Location[] getLocations() {
        return locations;
    }
}
