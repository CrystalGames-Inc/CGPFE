package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class AcrobaticSteps extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();

    public AcrobaticSteps() {
        super("Acrobatic Steps");
        setCanAcquire((mgr.player.attributes.dexterity >= 15) && (mgr.hasFeat(new NimbleMoves())));
    }
}
