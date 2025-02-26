package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class SpellMastery extends Feat {
    public SpellMastery() {
        super("Spell Mastery");
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.info.pClass == Class.WIZARD) &&
                (PlayerDataMgr.getInstance().player.info.level >= 1)
        );
    }
}
