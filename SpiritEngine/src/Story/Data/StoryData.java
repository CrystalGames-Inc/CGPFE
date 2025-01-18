package Story.Data;

import SpiritEngine.World.World;
import Story.Data.StoryModifiers.AbilityScoreType;
import Story.Data.StoryModifiers.Fantasty;
import Story.Data.StoryModifiers.GameSpeed;

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

    public World gameWorld;
}