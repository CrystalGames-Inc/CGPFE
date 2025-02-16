package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterSpellFocus extends Feat {
    public GreaterSpellFocus() {
        super("Greater Spell Focus");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellFocus()));
    }
}
