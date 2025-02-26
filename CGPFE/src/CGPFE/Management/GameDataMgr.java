package CGPFE.Management;

import CGPFE.Data.Game.GameData;
import CGPFE.Data.Game.StoryModifiers.AbilityScoreType;
import CGPFE.Data.Game.StoryModifiers.Fantasty;
import CGPFE.Data.Game.StoryModifiers.GameSpeed;

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
        if(storyData.gameWorld != null){
            for (int i = 0; i < storyData.gameWorld.getRegions().length; i++) {
                if(storyData.gameWorld.getRegions()[i] != null){
                    System.out.println(storyData.gameWorld.getRegions()[i].getName() + ":");
                    for (int j = 0; j < storyData.gameWorld.getRegions()[i].getLocations().length; j++) {
                        if(storyData.gameWorld.getRegions()[i].getLocations()[j] != null){
                            System.out.println(storyData.gameWorld.getRegions()[i].getLocations()[j].getName());
                        }
                    }
                }
            }
        }
    }
}
