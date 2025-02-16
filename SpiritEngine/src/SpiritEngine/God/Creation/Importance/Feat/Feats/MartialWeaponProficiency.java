package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;

public class MartialWeaponProficiency extends WeaponProficiency {
    public MartialWeaponProficiency() {
        super("Martial Weapon Proficiency", Weapons.getInstance().martialWeapons);
        setCanAcquire(true);
    }

    public MartialWeaponProficiency(Weapon proficientWeapon) {
        super("Simple Weapon Proficiency", Weapons.getInstance().simpleWeapons);
        setCanAcquire(true);
        setProficientWeapon(proficientWeapon);
    }

    public MartialWeaponProficiency(Weapon[] proficientWeapons) {
        super("Simple Weapon Proficiency", Weapons.getInstance().simpleWeapons);
        setCanAcquire(true);
        setProficientWeapons(proficientWeapons);
    }
}
