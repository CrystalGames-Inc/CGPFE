package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class NimbleMoves extends Feat {
    public NimbleMoves() {
        super("Nimble Moves");
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 13);
    }
}
