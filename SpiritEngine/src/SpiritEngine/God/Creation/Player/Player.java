package SpiritEngine.God.Creation.Player;

import SpiritEngine.Mechanics.Player.InventoryItem;
import SpiritEngine.God.Creation.Entity.Wallet;
import SpiritEngine.God.Creation.Entity.AttributeModifiers;
import SpiritEngine.God.Creation.Entity.Attributes;
import SpiritEngine.God.Creation.Entity.CombatInfo;

public class Player {

    public Info info;
    public CombatInfo combatInfo;
    public Attributes attributes;
    public AttributeModifiers attributeMods;
    public Wallet wallet;
    public InventoryItem[] inventory;

    public int abilityScorePoints;

    public Player(Info info, CombatInfo combatInfo, Attributes attributes, AttributeModifiers attributeMods, Wallet wallet, InventoryItem[] inventory){
        this.info = info;
        this.combatInfo = combatInfo;
        this.attributes = attributes;
        this.attributeMods = attributeMods;
        this.wallet = wallet;
        this.inventory = inventory;
    }
}