package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;

public class TripGreat extends Feat {
    public TripGreat(){
        setName("Greater Trip");
        setCombatFeat(true);
        setDepFeat(new TripImp());
        //TODO add base attack bonus
    }
}
