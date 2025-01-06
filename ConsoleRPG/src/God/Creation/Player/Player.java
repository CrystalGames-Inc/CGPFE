package God.Creation.Player;

import Game.Mechanics.Player.InventoryItem;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;

public class Player {

    public PlayerInfo info;
    public EntityAttributes attributes;
    public EntityAttributeModifiers attributeMods;
    public EntityWallet wallet;
    public InventoryItem[] inventory;

    public int abilityScorePoints;

    public Player(PlayerInfo info, EntityAttributes attributes, EntityAttributeModifiers attributeMods, EntityWallet wallet, InventoryItem[] inventory){
        this.info = info;
        this.attributes = attributes;
        this.attributeMods = attributeMods;
        this.wallet = wallet;
        this.inventory = inventory;
    }
}
