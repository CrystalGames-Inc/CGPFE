package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.I.ImprovedTwoWeaponFighting;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterTwoWeaponFighting extends Feat {
    public GreaterTwoWeaponFighting() {
        super("Greater Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 19) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedTwoWeaponFighting())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
