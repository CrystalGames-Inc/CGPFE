package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class SelectiveChanneling extends Feat {
    public SelectiveChanneling() {
        super("Selective Channeling");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.charisma >= 13);
    }
}
