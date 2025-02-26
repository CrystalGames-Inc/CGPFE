package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class SnatchArrows extends Feat {
    public SnatchArrows() {
        super("Snatch Arrows", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 15) &&
                (PlayerDataMgr.getInstance().hasFeat(new DeflectArrows())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike()))
        );
    }
}
