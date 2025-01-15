package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.DepAbility;
import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public class CombatExpertise extends Feat {
    public CombatExpertise(){
        setName("Combat Expertise");
        setCombatFeat(true);
        setDepAbility(new DepAbility(Attribute.INTELLIGENCE, 13));
    }
}
