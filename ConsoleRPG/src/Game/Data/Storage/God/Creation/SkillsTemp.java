package Game.Data.Storage.God.Creation;

import Game.Data.Models.God.Creation.SkillTemp;
import Game.Data.Storage.God.Creation.Skills.Acrobatics;
import God.Creation.Importance.Skills.*;

public class SkillsTemp {

    //region Skills

    public final SkillTemp acrobatics =             new SkillTemp("Acrobatics",                true,  true,  false, false, false, true,  false, false, true,  false, false, true,  Attribute.DEXTERITY);
    public final SkillTemp appraise =               new SkillTemp("Appraise",                  false, true,  true,  false, false, false, false, false, true,  true,  true,  true,  Attribute.INTELLIGENCE);
    public final SkillTemp bluff =                  new SkillTemp("Bluff",                     false, true,  false, false, false, false, false, false, true,  true,  false, true,  Attribute.CHARISMA);
    public final SkillTemp climb =                  new SkillTemp("Climb",                     true,  true,  false, true,  false, true,  false, true,  true,  false, false, true,  Attribute.STRENGTH);
    public final SkillTemp craft =                  new SkillTemp("Craft",                     true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  Attribute.INTELLIGENCE);
    public final SkillTemp diplomacy =              new SkillTemp("Diplomacy",                 false, true,  true,  false, false, true,  false, false, true,  false, false, true,  Attribute.CHARISMA);
    public final SkillTemp disableDevice =          new SkillTemp("Disable Device",            false, false, false, false, false, false, false, false, true,  false, false, false, Attribute.DEXTERITY);
    public final SkillTemp disguise =               new SkillTemp("Disguise",                  false, true,  false, false, false, false, false, false, true,  false, false, true,  Attribute.CHARISMA);
    public final SkillTemp escapeArtist =           new SkillTemp("Escape Artist",             false, true,  false, false, false, true,  false, false, true,  false, false, true,  Attribute.DEXTERITY);
    public final SkillTemp fly =                    new SkillTemp("Fly",                       false, false, false, true,  false, false, false, false, false, true,  true,  true,  Attribute.DEXTERITY);
    public final SkillTemp handleAnimal =           new SkillTemp("Handle Animal",             true,  false, false, true,  false, true,  true,  true,  false, false, false, false, Attribute.CHARISMA);
    public final SkillTemp heal =                   new SkillTemp("Heal",                      false, false, true,  true,  false, false, true,  true,  false, false, false, false, Attribute.WISDOM);
    public final SkillTemp intimidate =             new SkillTemp("Intimidate",                true,  true,  false, false, true,  true,  true,  true,  true,  false, false, true,  Attribute.CHARISMA);
    public final SkillTemp knowArcana =             new SkillTemp("Knowledge (Arcana)",        false, true,  true,  false, false, false, false, false, true,  true,  true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowDungeoneering =      new SkillTemp("Knowledge (Dungeoneering)", false, true,  false, false, true,  false, true,  true,  false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowEngineering =        new SkillTemp("Knowledge (Engineering)",   false, true,  false, true,  false, false, true,  false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowGeography =          new SkillTemp("Knowledge (Geography)",     false, true,  false, true,  false, false, true,  false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowHistory =            new SkillTemp("Knowledge (History)",       false, true,  true,  false, false, true,  false, false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowLocal =              new SkillTemp("Knowledge (Local)",         false, true,  false, false, false, false, false, true,  false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowNature =             new SkillTemp("Knowledge (Nature)",        true,  true,  false, true,  false, false, true,  false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowNobility =           new SkillTemp("Knowledge (Nobility)",      false, true,  true,  false, false, true,  false, false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowPlanes =             new SkillTemp("Knowledge (Planes)",        false, true,  true,  false, false, false, false, false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp knowReligion =           new SkillTemp("Knowledge (Religion)",      false, true,  true,  false, false, true,  true,  false, false, false, true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp linguistics =            new SkillTemp("Linguistics",               false, true,  true,  false, false, false, false, false, true,  false, false, true,  Attribute.INTELLIGENCE);
    public final SkillTemp perception =             new SkillTemp("Perception",                true,  true,  false, true,  false, true,  false, true,  true,  false, false, true,  Attribute.WISDOM);
    public final SkillTemp perform =                new SkillTemp("Perform",                   false, true,  false, false, false, true,  false, false, true,  false, false, true,  Attribute.CHARISMA);
    public final SkillTemp profession =             new SkillTemp("Profession",                false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  Attribute.WISDOM);
    public final SkillTemp ride =                   new SkillTemp("Ride",                      true,  false, false, true,  true,  true,  true,  true,  false, false, false, false, Attribute.DEXTERITY);
    public final SkillTemp senseMotive =            new SkillTemp("Sense Motive",              false, true,  true,  false, false, true,  false, false, true,  false, false, true,  Attribute.WISDOM);
    public final SkillTemp sleightOfHand =          new SkillTemp("Sleight Of Hand",           false, true,  false, false, false, false, false, false, true,  false, false, false, Attribute.DEXTERITY);
    public final SkillTemp spellcraft =             new SkillTemp("Spellcraft",                false, true,  true,  true,  false, false, true,  true,  false, true,  true,  false, Attribute.INTELLIGENCE);
    public final SkillTemp stealth =                new SkillTemp("Stealth",                   false, true,  false, false, false, true,  false, true,  true,  false, false, true,  Attribute.DEXTERITY);
    public final SkillTemp survival =               new SkillTemp("Survival",                  true,  false, false, true,  false, false, true,  false, false, false, false, true,  Attribute.WISDOM);
    public final SkillTemp swim =                   new SkillTemp("Swim",                      true,  false, false, true,  false, true,  true,  true,  false, false, false, false, Attribute.STRENGTH);
    public final SkillTemp useMagicDevice =         new SkillTemp("Use Magic Device",          false, true,  false, false, false, false, false, false, true,  true,  false, false, Attribute.CHARISMA);

    //endregion

    //region Class-Specific Skill Arrays

    public SkillTemp[] barbarianSkills = new SkillTemp[]{acrobatics, climb, craft, handleAnimal, intimidate, knowNature, perception, ride, survival, swim};
    public SkillTemp[] bardSkills = new SkillTemp[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disguise, escapeArtist, intimidate, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, linguistics, perception, perform, profession, senseMotive, sleightOfHand, spellcraft, stealth, useMagicDevice};
    public SkillTemp[] clericSkills = new SkillTemp[]{appraise, craft, diplomacy, heal, knowArcana, knowHistory, knowNobility, knowPlanes, knowReligion, linguistics, profession, senseMotive, spellcraft};
    public SkillTemp[] druidSkills = new SkillTemp[]{climb, craft, fly, handleAnimal, heal, knowEngineering, knowGeography, knowNature, perception, profession, ride, spellcraft, survival, swim};
    public SkillTemp[] fighterSkills = new SkillTemp[]{craft, intimidate, knowDungeoneering, profession, ride};
    public SkillTemp[] monkSkills = new SkillTemp[]{acrobatics, craft, intimidate, knowHistory, knowNobility, knowReligion, perception, perform, profession, ride, senseMotive, stealth, swim};
    public SkillTemp[] paladinSkills = new SkillTemp[]{craft, handleAnimal, heal, intimidate, knowDungeoneering, knowEngineering, knowGeography, knowNature, knowReligion, profession, ride, spellcraft, survival, swim};
    public SkillTemp[] rangerSkills = new SkillTemp[]{climb, craft, handleAnimal, heal, intimidate, knowDungeoneering, knowLocal, perception, profession, ride, spellcraft, stealth, swim};
    public SkillTemp[] rogueSkills = new SkillTemp[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disableDevice, disguise, escapeArtist, intimidate, knowArcana, linguistics, perception, perform, profession, senseMotive, sleightOfHand, stealth, useMagicDevice};
    public SkillTemp[] sorcererSkills = new SkillTemp[]{appraise, bluff, craft, fly, knowArcana, profession, spellcraft, useMagicDevice};
    public SkillTemp[] wizardSkills = new SkillTemp[]{appraise, craft, fly, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, profession, spellcraft};

    //endregion
}
