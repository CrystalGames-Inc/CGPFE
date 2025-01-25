package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Mobility extends Feat {
    public Mobility() {
        super("Mobility", Type.COMBAT);
        setCanAcquire(
                PlayerDataMgr.getInstance().player.attributes.dexterity >= 13 &&
                PlayerDataMgr.getInstance().hasFeat(new Dodge())
        );
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.AC, 2);
    }
}
