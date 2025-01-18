package SpiritEngine.God.Creation.Entity;

import SpiritEngine.Data.Models.Items.Equipment.Armor.*;
import SpiritEngine.God.Creation.ClassTable.Table;
import SpiritEngine.God.Creation.Player.Inventory.RangedWeapon;
import SpiritEngine.God.Creation.Player.Inventory.Weapon;

public class CombatInfo {
    public Table table;
    public int initMod;
    public int AC;
    public int fort;
    public int ref;
    public int will;
    public int BAB;
    public int sRes;
    public int CMB;
    public int CMD;
    public Weapon[] weapons;
    public RangedWeapon[] rangedWeapons;
    public Armor[] armors;
    public Shield[] shields;

    public CombatInfo(int initMod, int AC, int fort, int ref, int will, int BAB, int sRes, int CMB, int CMD, Weapon[] weapons, RangedWeapon[] rangedWeapons, Armor[] armors, Shield[] shields) {
        this.initMod = initMod;
        this.AC = AC;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
        this.BAB = BAB;
        this.sRes = sRes;
        this.CMB = CMB;
        this.CMD = CMD;
        this.weapons = weapons;
        this.rangedWeapons = rangedWeapons;
        this.armors = armors;
        this.shields = shields;
    }
}
