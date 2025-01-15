package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;

public class FeintImp extends Feat {
    public FeintImp(){
        setName("Improved Feint");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
