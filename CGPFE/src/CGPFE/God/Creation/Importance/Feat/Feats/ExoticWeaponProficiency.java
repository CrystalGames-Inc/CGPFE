package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Storage.Equipment.Weapons.Weapons;
import CGPFE.God.Creation.Importance.Feat.WeaponProficiency;
import CGPFE.Management.PlayerDataMgr;

public class ExoticWeaponProficiency extends WeaponProficiency {
    public ExoticWeaponProficiency() {
        super("Exotic Weapon Proficiency", Weapons.exoticWeapons);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
