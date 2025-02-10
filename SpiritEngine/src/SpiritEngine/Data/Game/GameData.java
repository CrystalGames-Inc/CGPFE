package SpiritEngine.Data.Game;

import SpiritEngine.World.World;
import SpiritEngine.Data.Game.StoryModifiers.AbilityScoreType;
import SpiritEngine.Data.Game.StoryModifiers.Fantasty;
import SpiritEngine.Data.Game.StoryModifiers.GameSpeed;

public class GameData {

    /* Fantasty level point distribution:
        Low - 10 points
        Standard - 15 points
        High - 20 points
        Epic - 20 points
    */
    private final Fantasty gameFantasty;

    //Determines how Ability Points are distributed in the beginning of the game (when creating a character)
    private final AbilityScoreType abilityScoreType;

    //Determines how much XP is needed to level up
    private final GameSpeed gameSpeed;

    private final World gameWorld;

    public GameData(Fantasty gameFantasty, AbilityScoreType abilityScoreType, GameSpeed gameSpeed, World gameWorld){
        this.gameFantasty = gameFantasty;
        this.abilityScoreType = abilityScoreType;
        this.gameSpeed = gameSpeed;
        this.gameWorld = gameWorld;
    }

    public Fantasty getGameFantasty() {
        return gameFantasty;
    }

    public AbilityScoreType getAbilityScoreType() {
        return abilityScoreType;
    }

    public GameSpeed getGameSpeed() {
        return gameSpeed;
    }

    public World getGameWorld() {
        return gameWorld;
    }
}