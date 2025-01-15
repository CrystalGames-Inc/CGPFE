package Story.Data.World;

import SpiritEngine.Game.World.GameWorld.Region;
import SpiritEngine.Game.World.GameWorld.World;
import Story.Data.World.Regions.ExampleRegion;

public class ExampleWorld extends World {
    public ExampleWorld(){
        Region[] regions = new Region[]{
                new ExampleRegion()
        };

        setName("The world of examples");
        setRegions(regions);

    }
}
