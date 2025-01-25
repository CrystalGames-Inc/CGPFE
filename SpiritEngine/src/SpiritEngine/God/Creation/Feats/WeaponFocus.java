package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class WeaponFocus extends Feat {
    public WeaponFocus() {
        super("Weapon Focus");
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
