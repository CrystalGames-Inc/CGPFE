package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.S.SpellFocus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterSpellFocus extends Feat {
    public GreaterSpellFocus() {
        super("Greater Spell Focus");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellFocus()));
    }
}
