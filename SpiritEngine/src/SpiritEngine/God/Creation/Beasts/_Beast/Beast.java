package SpiritEngine.God.Creation.Beasts._Beast;

import SpiritEngine.God.Creation.Beasts._Beast.Properties.*;
import SpiritEngine.God.Creation.Entity.Attributes;
import SpiritEngine.God.Creation.Importance.Constants.*;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Player.Inventory.RangedWeapon;
import SpiritEngine.God.Creation.Player.Inventory.Weapon;

public class Beast {

    public final Info info;


    public Defense defense;

    public Offense offense;

    public Statistics statistics;

    public Attributes attributes;

    public Beast(Info info, Defense defense, Offense offense, Statistics statistics, Attributes attributes) {
        this.info = info;
        this.defense = defense;
        this.offense = offense;
        this.statistics = statistics;
        this.attributes = attributes;
    }
}