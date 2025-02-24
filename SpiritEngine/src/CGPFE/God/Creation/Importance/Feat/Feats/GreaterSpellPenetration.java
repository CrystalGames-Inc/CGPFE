package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class GreaterSpellPenetration extends Feat {
    public GreaterSpellPenetration() {
        super("Greater Spell Penetration");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellPenetration()));
    }
}
