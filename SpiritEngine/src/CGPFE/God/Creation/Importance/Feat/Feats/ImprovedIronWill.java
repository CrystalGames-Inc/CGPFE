package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedIronWill extends Feat {
    public ImprovedIronWill() {
        super("Improved Iron Will");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new IronWill()));
    }
}
