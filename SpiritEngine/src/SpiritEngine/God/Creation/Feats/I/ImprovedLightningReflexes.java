package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Feats.L.LightningReflexes;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedLightningReflexes extends Feat {
    public ImprovedLightningReflexes() {
        super("Improved Lightning Reflexes");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new LightningReflexes()));
    }
}
