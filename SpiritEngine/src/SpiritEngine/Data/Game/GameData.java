package SpiritEngine.Data.Game;

import SpiritEngine.World.World;
import SpiritEngine.Data.Game.StoryModifiers.AbilityScoreType;
import SpiritEngine.Data.Game.StoryModifiers.Fantasty;
import SpiritEngine.Data.Game.StoryModifiers.GameSpeed;

public class GameData{

    public Fantasty gameFantasty;
    public AbilityScoreType abilityScoreType;
    public GameSpeed gameSpeed;
    public World gameWorld;

    public GameData(Fantasty gameFantasty, AbilityScoreType abilityScoreType, GameSpeed gameSpeed) {
        this.gameFantasty = gameFantasty;
        this.abilityScoreType = abilityScoreType;
        this.gameSpeed = gameSpeed;
    }
}