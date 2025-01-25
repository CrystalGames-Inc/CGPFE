package SpiritEngine.God.Creation.Importance.Feat;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;

public class WeaponProficiency extends Feat{

    private Weapon proficientWeapon;
    private Weapon[] proficientWeapons;

    public WeaponProficiency(String name, Weapon proficientWeapon) {
        super(name);
        setCanAcquire(true);
        this.proficientWeapon = proficientWeapon;
    }

    public WeaponProficiency(String name, Weapon[] proficientWeapons){
        super(name, Type.COMBAT);
        this.proficientWeapons = proficientWeapons;
    }

    public Weapon getProficientWeapon(){
        return proficientWeapon;
    }

    public Weapon[] getProficientWeapons(){
        return proficientWeapons;
    }
}
