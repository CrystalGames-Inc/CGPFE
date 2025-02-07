package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;
import SpiritEngine.Management.PlayerDataMgr;

public class ExoticWeaponProficiency extends WeaponProficiency {
    public ExoticWeaponProficiency() {
        super("Exotic Weapon Proficiency", Weapons.getInstance().exoticWeapons);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
