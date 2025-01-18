package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.DepAbility;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public class CombatExpertise extends Feat {
    public CombatExpertise(){
        setName("Combat Expertise");
        setCombatFeat(true);
        setDepAbility(new DepAbility(Attribute.INTELLIGENCE, 13));
    }
}
