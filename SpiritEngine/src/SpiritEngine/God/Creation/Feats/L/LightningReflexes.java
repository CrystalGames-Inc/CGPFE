package SpiritEngine.God.Creation.Feats.L;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class LightningReflexes extends Feat {
    public LightningReflexes() {
        super("Lightning Reflexes");
        setCanAcquire(true);
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.ref, 2);
    }
}
