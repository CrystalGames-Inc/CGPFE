package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedLightningReflexes extends Feat {
    public ImprovedLightningReflexes() {
        super("Improved Lightning Reflexes");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new LightningReflexes()));
    }
}
