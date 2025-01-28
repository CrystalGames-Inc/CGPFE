package SpiritEngine.God.Creation.NPC;

import SpiritEngine.Data.Models.Items.Equipment.Armor.Armor;
import SpiritEngine.Data.Models.Items.Equipment.Armor.Shield;
import SpiritEngine.Mechanics.Player.InventoryItem;
import SpiritEngine.God.Creation.Entity.*;

public class NPC {
    public Info info;
    public CombatInfo combatInfo;
    public Attributes attributes;
    public AttributeModifiers attributeMods;
    public Wallet wallet;
    public InventoryItem[] inventory;
    public int sizeBonus;

    public NPC(Info info, CombatInfo combatInfo, Attributes attributes, AttributeModifiers attributeMods, Wallet wallet, InventoryItem[] inventory) {
        this.info = info;
        this.combatInfo = combatInfo;
        this.attributes = attributes;
        this.attributeMods = attributeMods;
        this.wallet = wallet;
        this.inventory = inventory;

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