package Management;

import Story.Data.Fantasty;
import Story.Data.StoryData;

public class GameDataMgr {

    StoryData storyData = new StoryData(Fantasty.HIGH);

    Fantasty storyFantasty = storyData.gameFantasty;

    private static GameDataMgr _instance;

    public GameDataMgr(){

    }

    public static synchronized GameDataMgr getInstance(){
        if(_instance == null)
            _instance = new GameDataMgr();

        return _instance;
    }
}
