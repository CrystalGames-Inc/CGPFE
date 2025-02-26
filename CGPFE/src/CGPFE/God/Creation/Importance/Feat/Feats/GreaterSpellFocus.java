package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class GreaterSpellFocus extends Feat {
    public GreaterSpellFocus() {
        super("Greater Spell Focus");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellFocus()));
    }
}
