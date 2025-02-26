package CGPFE.God.Creation.Importance.Feat;

import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;

public class WeaponProficiency extends Feat{

    private Weapon proficientWeapon;
    private Weapon[] proficientWeapons;

    public WeaponProficiency(String name, Weapon proficientWeapon) {
        super(name);
        setCanAcquire(true);
        this.proficientWeapon = proficientWeapon;
    }

    public WeaponProficiency(String name, Weapon[] proficientWeapons) {
        super(name);
        setCanAcquire(true);
        this.proficientWeapons = proficientWeapons;
    }

    public WeaponProficiency(Weapon[] proficientWeapons) {
        super("");
        setCanAcquire(true);
        this.proficientWeapons = proficientWeapons;
    }

    public void setProficientWeapon(Weapon proficientWeapon){
        this.proficientWeapon = proficientWeapon;
    }

    public void setProficientWeapons(Weapon[] proficientWeapons){
        this.proficientWeapons = proficientWeapons;
    }

    public Weapon getProficientWeapon(){
        return proficientWeapon;
    }

    public Weapon[] getProficientWeapons(){
        return proficientWeapons;
    }
}
