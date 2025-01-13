package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;

public class FeintGreat extends Feat {
    public FeintGreat(){
        setName("Greater Feint");
        setCombatFeat(true);
        setDepFeat(new FeintImp());
        //TODO add base attack bonus
    }
}
