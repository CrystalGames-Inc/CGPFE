package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;

public class SimpleWeaponProficiency extends WeaponProficiency {
    public SimpleWeaponProficiency() {
        super("Simple Weapon Proficiency", new Weapons().simpleWeapons);
        setCanAcquire(true);
    }
}
