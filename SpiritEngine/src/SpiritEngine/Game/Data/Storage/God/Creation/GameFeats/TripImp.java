package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;

public class TripImp extends Feat {
    public TripImp(){
        setName("Improved Trip");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
