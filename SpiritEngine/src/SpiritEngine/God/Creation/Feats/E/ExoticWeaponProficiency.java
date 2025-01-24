package SpiritEngine.God.Creation.Feats.E;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ExoticWeaponProficiency extends Feat {
    public ExoticWeaponProficiency() {
        super("Exotic Weapon Proficiency", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
