package CGPFE.God.Creation.Player;

import CGPFE.Mechanics.Player.InventoryItem;
import CGPFE.God.Creation.Entity.Wallet;
import CGPFE.God.Creation.Entity.Attributes;
import CGPFE.God.Creation.Entity.CombatInfo;

public class Player {

    public Info info;
    public CombatInfo combatInfo;
    public Attributes attributes;
    public Attributes attributeMods;
    public Wallet wallet;
    public InventoryItem[] inventory;

    public int abilityScorePoints;

    public Player(Info info, CombatInfo combatInfo, Attributes attributes, Attributes attributeMods, Wallet wallet, InventoryItem[] inventory){
        this.info = info;
        this.combatInfo = combatInfo;
        this.attributes = attributes;
        this.attributeMods = attributeMods;
        this.wallet = wallet;
        this.inventory = inventory;
    }
}