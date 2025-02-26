package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;
import CGPFE.Data.Storage.Equipment.Weapons.Weapons;
import CGPFE.God.Creation.Importance.Feat.WeaponProficiency;

public class SimpleWeaponProficiency extends WeaponProficiency {
    public SimpleWeaponProficiency() {
        super("Simple Weapon Proficiency", Weapons.simpleWeapons);
        setCanAcquire(true);
    }

    public SimpleWeaponProficiency(Weapon proficientWeapon) {
        super("Simple Weapon Proficiency", Weapons.simpleWeapons);
        setCanAcquire(true);
        setProficientWeapon(proficientWeapon);
    }

    public SimpleWeaponProficiency(Weapon[] proficientWeapons) {
        super("Simple Weapon Proficiency", Weapons.simpleWeapons);
        setCanAcquire(true);
        setProficientWeapons(proficientWeapons);
    }
}
