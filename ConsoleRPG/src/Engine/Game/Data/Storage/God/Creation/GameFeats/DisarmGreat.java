package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;

public class DisarmGreat extends Feat {
    public DisarmGreat(){
        setName("Greater Disarm");
        setCombatFeat(true);
        setDepFeat(new DisarmImp());
        //TODO add base attack bonus
    }
}
