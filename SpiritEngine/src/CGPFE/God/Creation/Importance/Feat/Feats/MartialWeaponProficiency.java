package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;
import CGPFE.Data.Storage.Equipment.Weapons.Weapons;
import CGPFE.God.Creation.Importance.Feat.WeaponProficiency;

public class MartialWeaponProficiency extends WeaponProficiency {
    public MartialWeaponProficiency() {
        super("Martial Weapon Proficiency", Weapons.martialWeapons);
        setCanAcquire(true);
    }

    public MartialWeaponProficiency(Weapon proficientWeapon) {
        super("Simple Weapon Proficiency", Weapons.simpleWeapons);
        setCanAcquire(true);
        setProficientWeapon(proficientWeapon);
    }

    public MartialWeaponProficiency(Weapon[] proficientWeapons) {
        super("Simple Weapon Proficiency", Weapons.simpleWeapons);
        setCanAcquire(true);
        setProficientWeapons(proficientWeapons);
    }
}
