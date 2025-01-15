package Story.Data;

import SpiritEngine.Game.World.GameWorld.World;
import Story.Data.StoryModifiers.AbilityScoreType;
import Story.Data.StoryModifiers.Fantasty;
import Story.Data.StoryModifiers.GameSpeed;
import Story.Data.World.ExampleWorld;

public class StoryData {
    /* Fantasty level point distribution
        Low - 10 points
        Standard - 15 points
        High - 20 points
        Epic - 20 points
     */
    public Fantasty gameFantasty = Fantasty.HIGH;

    //I have decided not to include the dice pool into the game.
    public AbilityScoreType abilityScoreType = AbilityScoreType.STANDARD;

    //The gameSpeed variable determines the amount of experience points needed to level up.
    public GameSpeed gameSpeed = GameSpeed.MEDIUM;

    //The game world the story takes place in. Of course, you could have multiple worlds.
    public World gameWorld = new ExampleWorld();

}