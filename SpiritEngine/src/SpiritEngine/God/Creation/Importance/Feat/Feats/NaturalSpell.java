package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class NaturalSpell extends Feat {
    public NaturalSpell() {
        super("Natural Spell");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.wisdom >= 13);
    }
}
