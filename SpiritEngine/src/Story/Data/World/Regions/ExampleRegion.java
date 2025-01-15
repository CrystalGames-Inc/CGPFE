package Story.Data.World.Regions;

import SpiritEngine.Game.World.GameWorld.Location;
import SpiritEngine.Game.World.GameWorld.Region;
import Story.Data.World.Locations.ExampleTemple;
import Story.Data.World.Locations.ExampleVillage;

public class ExampleRegion extends Region {
    public ExampleRegion(){
        Location[] locations = new Location[]{
                new ExampleVillage(),
                new ExampleTemple()
        };


        setName("The land of Examples");
        setLocations(locations);
    }
}
