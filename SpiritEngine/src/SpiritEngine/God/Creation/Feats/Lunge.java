package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Lunge extends Feat {
    public Lunge() {
        super("Lunge", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6);
    }
}
