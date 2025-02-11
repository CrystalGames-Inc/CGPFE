package SpiritEngine.God.Creation.NPC;

import SpiritEngine.Data.Models.Items.Equipment.Armor.Armor;
import SpiritEngine.Data.Models.Items.Equipment.Armor.Shield;
import SpiritEngine.God.Creation.Importance.Constants.Size;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Skills._Skills;
import SpiritEngine.Mechanics.Player.InventoryItem;
import SpiritEngine.God.Creation.Entity.*;

public class NPC {
    public Info info;
    public CombatInfo combatInfo;
    public Attributes attributes;
    public Attributes attributeMods;
    public Wallet wallet;
    public InventoryItem[] inventory;
    public int sizeBonus;

    public NPC(Info info, CombatInfo combatInfo, Attributes attributes, Attributes attributeMods, Wallet wallet, InventoryItem[] inventory) {
        this.info = info;
        this.combatInfo = combatInfo;
        this.attributes = attributes;
        this.attributeMods = attributeMods;
        this.wallet = wallet;
        this.inventory = inventory;

        this.info.size = calculateSize();
        calculateClassBonuses();
    }

    void calculateClassBonuses(){
        combatInfo.BAB = calculateBAB();
        combatInfo.AC = calculateAC();
        combatInfo.CMB = calculateCMB();
        combatInfo.CMD = calculateCMD();
        combatInfo.fort = calculateFort();
        combatInfo.ref = calculateRef();
        combatInfo.will = calculateWill();
        sizeBonus = calculateSizeBonus();
    }

    Skill[] assignClassSkills(){
        _Skills gameSkills = _Skills.getInstance();
        switch (info.nClass){
            case ADEPT -> {
                return gameSkills.adeptSkills;
            }
            case ARISTOCRAT -> {
                return gameSkills.aristocratSkills;
            }
            case COMMONER -> {
                return gameSkills.commonerSkills;
            }
            case EXPERT -> {}
            case WARRIOR -> {
                return gameSkills.warriorSkills;
            }
        }
        return null;
    }

    public Skill[] assignExpertSkills(Skill[] skills){
        return skills;
    }

    Size calculateSize(){
        switch (info.race){
            case DWARF, HUMAN, HALFORC, HALFELF, ELF -> {
                return Size.MEDIUM;
            }
            case GNOME, HALFLING -> {
                return Size.SMALL;
            }
        }
        return Size.MEDIUM;
    }

    int calculateSizeBonus(){
        switch (info.size){
            case FINE -> sizeBonus = 8;
            case DIMINUTIVE -> sizeBonus = 4;
            case TINY -> sizeBonus = 2;
            case SMALL -> sizeBonus = 1;
            case MEDIUM -> sizeBonus = 0;
            case LARGE -> sizeBonus = -1;
            case HUGE -> sizeBonus = -2;
            case GARGANTUAN -> sizeBonus = -4;
            case COLOSSAL -> sizeBonus = -8;
        }

        return 0;
    }

    int calculateBAB(){
        return combatInfo.table.getLevel(info.level).BAB;
    }

    int calculateAC(){
        int armorBonus = 0, shieldBonus = 0;
        for (Armor armor: combatInfo.armors) {
            if(armor != null)
                armorBonus += armor.armorBonus;
        }
        if(combatInfo.shields != null) {
            for (Shield shield : combatInfo.shields) {
                if(shield != null)
                    shieldBonus += shield.shieldBonus;
            }
        }
        return 10 + armorBonus + shieldBonus + attributeMods.dexterity + sizeBonus;
    }

    int calculateCMB(){
        return combatInfo.BAB + attributeMods.strength + sizeBonus;
    }

    int calculateCMD(){
        return 10 + combatInfo.BAB + attributeMods.strength + attributeMods.dexterity + sizeBonus;
    }

    int calculateFort(){
        return attributeMods.constitution + combatInfo.table.getLevel(info.level).fortSave;
    }

    int calculateRef(){
        return attributeMods.dexterity + combatInfo.table.getLevel(info.level).refSave;
    }

    int calculateWill(){
        return attributeMods.wisdom + combatInfo.table.getLevel(info.level).willSave;
    }
}