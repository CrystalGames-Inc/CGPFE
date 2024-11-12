package God.Creation.Entity;

import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Entity.Mandatory.EntityInfo;

public class Entity {
    public EntityInfo Info;
    public EntityAttributes Attributes;
    public EntityAttributeModifiers AttributeMods;

    public Entity(EntityInfo info, EntityAttributes attributes, EntityAttributeModifiers attributeMods){
        Info = info;
        Attributes = attributes;
        AttributeMods = attributeMods;

    }

}