package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class FeintGreat extends Feat {
    public FeintGreat(){
        setName("Greater Feint");
        setCombatFeat(true);
        setDepFeat(new FeintImp());
        //TODO add base attack bonus
    }
}
