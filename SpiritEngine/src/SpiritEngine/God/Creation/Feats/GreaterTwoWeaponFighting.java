package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterTwoWeaponFighting extends Feat {
    public GreaterTwoWeaponFighting() {
        super("Greater Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.Dexterity >= 19) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedTwoWeaponFighting())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
