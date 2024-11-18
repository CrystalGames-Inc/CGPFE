package Management.Player;

import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Entity.Mandatory.EntityInfo;

public class Player {

    public PlayerInfo Info;
    public EntityAttributes Attributes;
    public EntityAttributeModifiers AttributeMods;
    public EntityWallet Wallet;

    public Player(PlayerInfo info, EntityAttributes attributes, EntityAttributeModifiers attributeMods, EntityWallet wallet){
        Info = info;
        Attributes = attributes;
        AttributeMods = attributeMods;
        Wallet = wallet;
    }
}
