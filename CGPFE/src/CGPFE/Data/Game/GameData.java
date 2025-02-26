package CGPFE.Data.Game;

import CGPFE.World.World;
import CGPFE.Data.Game.StoryModifiers.AbilityScoreType;
import CGPFE.Data.Game.StoryModifiers.Fantasty;
import CGPFE.Data.Game.StoryModifiers.GameSpeed;

public class GameData{

    public Fantasty gameFantasty;
    public AbilityScoreType abilityScoreType;
    public GameSpeed gameSpeed;
    public World gameWorld;

    public GameData(Fantasty gameFantasty, AbilityScoreType abilityScoreType, GameSpeed gameSpeed) {
        System.out.println("Powered By CGPFE");
        this.gameFantasty = gameFantasty;
        this.abilityScoreType = abilityScoreType;
        this.gameSpeed = gameSpeed;
    }
}