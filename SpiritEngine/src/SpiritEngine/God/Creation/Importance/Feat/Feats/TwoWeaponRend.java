package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class TwoWeaponRend extends Feat {
    public TwoWeaponRend() {
        super("Two-Weapon Rend", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 17) &&
                (PlayerDataMgr.getInstance().hasFeat(new DoubleSlice())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedTwoWeaponFighting())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11)
        );
    }
}
