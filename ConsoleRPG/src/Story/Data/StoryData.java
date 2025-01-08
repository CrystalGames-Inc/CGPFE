package Story.Data;

import Story.Data.StoryModifiers.AbilityScoreType;
import Story.Data.StoryModifiers.Fantasty;

public class StoryData {
    /* Fantasty level point distribution
        Low - 10 points
        Standard - 15 points
        High - 20 points
        Epic - 20 points
     */
    public Fantasty gameFantasty = Fantasty.HIGH;

    //I have decided not to include the dice pool into the game.

    public AbilityScoreType abilityScoreType = AbilityScoreType.CLASSIC;
}