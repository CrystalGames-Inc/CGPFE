package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class SelectiveChanneling extends Feat {
    public SelectiveChanneling() {
        super("Selective Channeling");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.charisma >= 13);
    }
}
