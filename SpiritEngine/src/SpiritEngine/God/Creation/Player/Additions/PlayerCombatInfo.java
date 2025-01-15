package SpiritEngine.God.Creation.Player.Additions;

import SpiritEngine.Game.Data.Models.Items.Equipment.Armor.*;

public class PlayerCombatInfo {
    public int initMod;
    public int AC;
    public int fort;
    public int ref;
    public int will;
    public int BAB;
    public int sRes;
    public int CMB;
    public int CMD;
    public PlayerWeapon[] weapons;
    public PlayerRangedWeapon[] rangedWeapons;
    public Armor[] armors;
    public Shield[] shields;

    public PlayerCombatInfo(int initMod, int AC, int fort, int ref, int will, int BAB, int sRes, int CMB, int CMD, PlayerWeapon[] weapons, PlayerRangedWeapon[] rangedWeapons, Armor[] armors, Shield[] shields) {
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
