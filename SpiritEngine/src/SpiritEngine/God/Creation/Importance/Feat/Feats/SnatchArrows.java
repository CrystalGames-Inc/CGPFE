package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

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
