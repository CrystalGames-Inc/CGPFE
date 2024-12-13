package God.Creation.Player;

import Game.Data.Models.Item;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;

public class Player {

    public PlayerInfo Info;
    public EntityAttributes Attributes;
    public EntityAttributeModifiers AttributeMods;
    public EntityWallet Wallet;
    public Item[] Inventory;

    public Player(PlayerInfo info, EntityAttributes attributes, EntityAttributeModifiers attributeMods, EntityWallet wallet, Item[] inventory){
        Info = info;
        Attributes = attributes;
        AttributeMods = attributeMods;
        Wallet = wallet;
        Inventory = inventory;
    }
}
