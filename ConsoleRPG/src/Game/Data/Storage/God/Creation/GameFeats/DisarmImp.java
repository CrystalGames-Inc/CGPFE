package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;

public class DisarmImp extends Feat {
    public DisarmImp(){
        setName("Improved Disarm");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
