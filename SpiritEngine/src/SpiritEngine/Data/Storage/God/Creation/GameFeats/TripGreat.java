package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class TripGreat extends Feat {
    public TripGreat(){
        setName("Greater Trip");
        setCombatFeat(true);
        setDepFeat(new TripImp());
        //TODO add base attack bonus
    }
}
