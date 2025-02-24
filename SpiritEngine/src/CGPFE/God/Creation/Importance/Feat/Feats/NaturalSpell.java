package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class NaturalSpell extends Feat {
    public NaturalSpell() {
        super("Natural Spell");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.wisdom >= 13);
    }
}
