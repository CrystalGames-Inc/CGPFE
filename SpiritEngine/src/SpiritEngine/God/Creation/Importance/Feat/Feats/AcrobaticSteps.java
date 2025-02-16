package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class AcrobaticSteps extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();

    public AcrobaticSteps() {
        super("Acrobatic Steps");
        setCanAcquire((mgr.player.attributes.dexterity >= 15) && (mgr.hasFeat(new NimbleMoves())));
    }
}
