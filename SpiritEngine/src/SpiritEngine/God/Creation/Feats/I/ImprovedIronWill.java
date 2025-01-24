package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedIronWill extends Feat {
    public ImprovedIronWill() {
        super("Improved Iron Will");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new IronWill()));
    }
}
