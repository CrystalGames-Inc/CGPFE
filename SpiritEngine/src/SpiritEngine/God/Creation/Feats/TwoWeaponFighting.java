package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class TwoWeaponFighting extends Feat {
    public TwoWeaponFighting() {
        super("Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 15);
    }
}
