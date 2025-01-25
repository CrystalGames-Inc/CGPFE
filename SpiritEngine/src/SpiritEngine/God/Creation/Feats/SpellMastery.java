package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class SpellMastery extends Feat {
    public SpellMastery() {
        super("Spell Mastery");
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.info.pClass == Class.WIZARD) &&
                (PlayerDataMgr.getInstance().player.info.level >= 1)
        );
    }
}
