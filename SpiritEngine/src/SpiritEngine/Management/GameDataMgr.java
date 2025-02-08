package SpiritEngine.Management;

import SpiritEngine.Data.Game.GameData;
import SpiritEngine.Data.Game.StoryModifiers.AbilityScoreType;
import SpiritEngine.Data.Game.StoryModifiers.Fantasty;
import SpiritEngine.Data.Game.StoryModifiers.GameSpeed;

public class GameDataMgr {

    GameData storyData = new GameData(Fantasty.HIGH, AbilityScoreType.STANDARD, GameSpeed.MEDIUM);

    private static GameDataMgr _instance;

    public GameDataMgr(){

    }

    public static synchronized GameDataMgr getInstance(){
        if(_instance == null){
            _instance = new GameDataMgr();
        }
        return  _instance;
    }

    public void displayLocations(){
        for (int i = 0; i < storyData.getGameWorld().getRegions().length; i++) {
            for (int j = 0; j < storyData.getGameWorld().getRegions()[i].getLocations().length; j++) {
                System.out.println(storyData.getGameWorld().getRegions()[i].getLocations()[j].getName());
            }
        }
    }
}
