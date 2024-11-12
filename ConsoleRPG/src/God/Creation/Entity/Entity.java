package God.Creation.Entity;

import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;

public class Entity {
    public EntityAttributes Attributes;
    public EntityAttributeModifiers AttributeMods;

    public Entity(EntityAttributes attributes, EntityAttributeModifiers attributeMods){
        Attributes = attributes;
        AttributeMods = attributeMods;

    }

}