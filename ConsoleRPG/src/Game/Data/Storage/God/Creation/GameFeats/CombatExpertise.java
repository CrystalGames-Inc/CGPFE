package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.DepAbility;
import Game.Data.Models.God.Creation.Feat.Feat;
import God.Creation.Importance.Constants.Attribute;

public class CombatExpertise extends Feat {
    public CombatExpertise(){
        setName("Combat Expertise");
        setCombatFeat(true);
        setDepAbility(new DepAbility(Attribute.INTELLIGENCE, 13));
    }
}
