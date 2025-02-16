package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterSpellPenetration extends Feat {
    public GreaterSpellPenetration() {
        super("Greater Spell Penetration");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellPenetration()));
    }
}
