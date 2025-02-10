package SpiritEngine.Management;

import SpiritEngine.Data.Game.GameData;
import SpiritEngine.Data.Game.StoryModifiers.AbilityScoreType;
import SpiritEngine.Data.Game.StoryModifiers.Fantasty;
import SpiritEngine.Data.Game.StoryModifiers.GameSpeed;
import SpiritEngine.World.World;

public class GameDataMgr {

    GameData storyData = new GameData(Fantasty.HIGH, AbilityScoreType.STANDARD, GameSpeed.MEDIUM, new World());

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
        if(storyData.getGameWorld() != null){
            for (int i = 0; i < storyData.getGameWorld().getRegions().length; i++) {
                if(storyData.getGameWorld().getRegions()[i] != null){
                    System.out.println(storyData.getGameWorld().getRegions()[i].getName() + ":");
                    for (int j = 0; j < storyData.getGameWorld().getRegions()[i].getLocations().length; j++) {
                        if(storyData.getGameWorld().getRegions()[i].getLocations()[j] != null){
                            System.out.println(storyData.getGameWorld().getRegions()[i].getLocations()[j].getName());
                        }
                    }
                }
            }
        }
    }
}
