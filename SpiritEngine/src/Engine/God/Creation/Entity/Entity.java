package Engine.God.Creation.Entity;

import Engine.God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import Engine.God.Creation.Entity.Mandatory.EntityAttributes;
import Engine.God.Creation.Entity.Mandatory.EntityInfo;

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