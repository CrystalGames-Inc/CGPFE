package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class StrikeBack extends Feat {
    public StrikeBack() {
        super("Strike Back", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11);
    }
}
