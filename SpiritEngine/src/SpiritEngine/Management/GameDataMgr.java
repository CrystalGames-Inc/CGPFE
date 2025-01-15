package SpiritEngine.Management;

import Story.Data.StoryData;

public class GameDataMgr {

    StoryData storyData = new StoryData();

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
        for (int i = 0; i < storyData.gameWorld.getRegions().length; i++) {
            for (int j = 0; j < storyData.gameWorld.getRegions()[i].getLocations().length; j++) {
                System.out.println(storyData.gameWorld.getRegions()[i].getLocations()[j].getName());
            }
        }
    }
}
