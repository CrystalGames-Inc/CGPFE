package SpiritEngine.Game.World.GameWorld;

import java.util.List;

public class Region {

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
