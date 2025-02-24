package CGPFE.God.Creation.Entity;

import CGPFE.Data.Models.Items.Equipment.Armor.*;
import CGPFE.God.Creation.ClassTable.Table;
import CGPFE.God.Creation.Importance.Constants.CMBCalcBonus;
import CGPFE.God.Creation.Player.Inventory.RangedWeapon;

public class CombatInfo {
    public Table table;
    public int initMod;
    public int AC;
    public int fort;
    public int ref;
    public int will;
    public int BAB;
    public int sRes;
    public CMBCalcBonus cmbCalcBonus;
    public int CMB;
    public int CMD;
    public CGPFE.Data.Models.Items.Equipment.Weapon.Weapon[] weapons;
    public RangedWeapon[] rangedWeapons;
    public Armor[] armors;
    public Shield[] shields;

    public CombatInfo(int initMod, int AC, int fort, int ref, int will, int BAB, int sRes, CMBCalcBonus cmbCalcBonus, int CMB, int CMD, CGPFE.Data.Models.Items.Equipment.Weapon.Weapon[] weapons, RangedWeapon[] rangedWeapons, Armor[] armors, Shield[] shields) {
        this.initMod = initMod;
        this.AC = AC;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
        this.BAB = BAB;
        this.sRes = sRes;
        this.cmbCalcBonus = cmbCalcBonus;
        this.CMB = CMB;
        this.CMD = CMD;
        this.weapons = weapons;
        this.rangedWeapons = rangedWeapons;
        this.armors = armors;
        this.shields = shields;
    }
}
