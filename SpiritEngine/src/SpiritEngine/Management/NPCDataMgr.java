package SpiritEngine.Management;

public class NPCDataMgr {

    private static NPCDataMgr _instance;

    public NPCDataMgr(){

    }

    public static synchronized NPCDataMgr getInstance(){
        if(_instance == null)
            _instance = new NPCDataMgr();

        return _instance;
    }



    public void calculateClassBonuses(){

    }
}