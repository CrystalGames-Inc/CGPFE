package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;

public class MartialWeaponProficiency extends WeaponProficiency {
    public MartialWeaponProficiency() {
        super("Martial Weapon Proficiency", new Weapons().martialWeapons);
        setCanAcquire(true);
    }
}
