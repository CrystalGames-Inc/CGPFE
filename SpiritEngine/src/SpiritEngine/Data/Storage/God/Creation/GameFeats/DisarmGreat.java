package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class DisarmGreat extends Feat {
    public DisarmGreat(){
        setName("Greater Disarm");
        setCombatFeat(true);
        setDepFeat(new DisarmImp());
        //TODO add base attack bonus
    }
}
