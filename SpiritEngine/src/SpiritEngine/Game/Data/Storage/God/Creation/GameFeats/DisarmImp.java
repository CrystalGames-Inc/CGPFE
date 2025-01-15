package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;

public class DisarmImp extends Feat {
    public DisarmImp(){
        setName("Improved Disarm");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
