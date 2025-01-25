package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class NimbleMoves extends Feat {
    public NimbleMoves() {
        super("Nimble Moves");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 13);
    }
}
