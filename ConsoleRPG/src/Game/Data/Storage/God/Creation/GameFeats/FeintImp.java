package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;

public class FeintImp extends Feat {
    public FeintImp(){
        setName("Improved Feint");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
