package God.Creation.Importance.Skills;

public class Skills {
    public static Skill acrobatics =             new Skill("Acrobatics",                true,  true,  false, false, false, true,  false, false, true,  false, false, true,  "DEX");
    public static Skill appraise =               new Skill("Appraise",                  false, true,  true,  false, false, false, false, false, true,  true,  true,  true,  "INT");
    public static Skill bluff =                  new Skill("Bluff",                     false, true,  false, false, false, false, false, false, true,  true,  false, true,  "CHA");
    public static Skill climb =                  new Skill("Climb",                     true,  true,  false, true,  false, true,  false, true,  true,  false, false, true,  "STR");
    public static Skill craft =                  new Skill("Craft",                     true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  "INT");
    public static Skill diplomacy =              new Skill("Diplomacy",                 false, true,  true,  false, false, true,  false, false, true,  false, false, true,  "CHA");
    public static Skill disableDevice =          new Skill("Disable Device",            false, false, false, false, false, false, false, false, true,  false, false, false, "DEX");
    public static Skill disguise =               new Skill("Disguise",                  false, true,  false, false, false, false, false, false, true,  false, false, true,  "CHA");
    public static Skill escapeArtist =           new Skill("Escape Artist",             false, true,  false, false, false, true,  false, false, true,  false, false, true,  "DEX");
    public static Skill fly =                    new Skill("Fly",                       false, false, false, true,  false, false, false, false, false, true,  true,  true,  "DEX");
    public static Skill handleAnimal =           new Skill("Handle Animal",             true,  false, false, true,  false, true,  true,  true,  false, false, false, false, "CHA");
    public static Skill heal =                   new Skill("Heal",                      false, false, true,  true,  false, false, true,  true,  false, false, false, false, "WIS");
    public static Skill intimidate =             new Skill("Intimidate",                true,  true,  false, false, true,  true,  true,  true,  true,  false, false, true,  "CHA");
    public static Skill knowArcana =             new Skill("Knowledge (Arcana)",        false, true,  true,  false, false, false, false, false, true,  true,  true,  false, "INT");
    public static Skill knowDungeoneering =      new Skill("Knowledge (Dungeoneering)", false, true,  false, false, true,  false, true,  true,  false, false, true,  false, "INT");
    public static Skill knowEngineering =        new Skill("Knowledge (Engineering)",   false, true,  false, true,  false, false, true,  false, false, false, true,  false, "INT");
    public static Skill knowGeography =          new Skill("Knowledge (Geography)",     false, true,  false, true,  false, false, true,  false, false, false, true,  false, "INT");
    public static Skill knowHistory =            new Skill("Knowledge (History)",       false, true,  true,  false, false, true,  false, false, false, false, true,  false, "INT");
    public static Skill knowLocal =              new Skill("Knowledge (Local)",         false, true,  false, false, false, false, false, true,  false, false, true,  false, "INT");
    public static Skill knowNature =             new Skill("Knowledge (Nature)",        true,  true,  false, true,  false, false, true,  false, false, false, true,  false, "INT");
    public static Skill knowNobility =           new Skill("Knowledge (Nobility)",      false, true,  true,  false, false, true,  false, false, false, false, true,  false, "INT");
    public static Skill knowPlanes =             new Skill("Knowledge (Planes)",        false, true,  true,  false, false, false, false, false, false, false, true,  false, "INT");
    public static Skill knowReligion =           new Skill("Knowledge (Religion)",      false, true,  true,  false, false, true,  true,  false, false, false, true,  false, "INT");
    public static Skill linguistics =            new Skill("Linguistics",               false, true,  true,  false, false, false, false, false, true,  false, false, true,  "INT");
    public static Skill perception =             new Skill("Perception",                true,  true,  false, true,  false, true,  false, true,  true,  false, false, true,  "WIS");
    public static Skill perform =                new Skill("Perform",                   false, true,  false, false, false, true,  false, false, true,  false, false, true,  "CHA");
    public static Skill profession =             new Skill("Profession",                false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  "WIS");
    public static Skill ride =                   new Skill("Ride",                      true,  false, false, true,  true,  true,  true,  true,  false, false, false, false, "DEX");
    public static Skill senseMotive =            new Skill("Sense Motive",              false, true,  true,  false, false, true,  false, false, true,  false, false, true,  "WIS");
    public static Skill sleightOfHand =          new Skill("Sleight Of Hand",           false, true,  false, false, false, false, false, false, true,  false, false, false, "DEX");
    public static Skill spellcraft =             new Skill("Spellcraft",                false, true,  true,  true,  false, false, true,  true,  false, true,  true,  false, "INT");
    public static Skill stealth =                new Skill("Stealth",                   false, true,  false, false, false, true,  false, true,  true,  false, false, true,  "DEX");
    public static Skill survival =               new Skill("Survival",                  true,  false, false, true,  false, false, true,  false, false, false, false, true,  "WIS");
    public static Skill swim =                   new Skill("Swim",                      true,  false, false, true,  false, true,  true,  true,  false, false, false, false, "STR");
    public static Skill useMagicDevice =         new Skill("Use Magic Device",          false, true,  false, false, false, false, false, false, true,  true,  false, false, "CHA");

    //region Class-Specific Skill Arrays

    public static Skill[] barbarianSkills = new Skill[]{acrobatics, climb, craft, handleAnimal, intimidate, knowNature, perception, ride, survival, swim};
    public static Skill[] bardSkills = new Skill[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disguise, escapeArtist, intimidate, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, linguistics, perception, perform, profession, senseMotive, sleightOfHand, spellcraft, stealth, useMagicDevice};
    public static Skill[] clericSkills = new Skill[]{appraise, craft, diplomacy, heal, knowArcana, knowHistory, knowNobility, knowPlanes, knowReligion, linguistics, profession, senseMotive, spellcraft};
    public static Skill[] druidSkills = new Skill[]{climb, craft, fly, handleAnimal, heal, knowEngineering, knowGeography, knowNature, perception, profession, ride, spellcraft, survival, swim};
    public static Skill[] fighterSkills = new Skill[]{craft, intimidate, knowDungeoneering, profession, ride};
    public static Skill[] monkSkills = new Skill[]{acrobatics, craft, intimidate, knowHistory, knowNobility, knowReligion, perception, perform, profession, ride, senseMotive, stealth, swim};
    public static Skill[] paladinSkills = new Skill[]{craft, handleAnimal, heal, intimidate, knowDungeoneering, knowEngineering, knowGeography, knowNature, knowReligion, profession, ride, spellcraft, survival, swim};
    public static Skill[] rangerSkills = new Skill[]{climb, craft, handleAnimal, heal, intimidate, knowDungeoneering, knowLocal, perception, profession, ride, spellcraft, stealth, swim};
    public static Skill[] rogueSkills = new Skill[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disableDevice, disguise, escapeArtist, intimidate, knowArcana, linguistics, perception, perform, profession, senseMotive, sleightOfHand, stealth, useMagicDevice};
    public static Skill[] sorcererSkills = new Skill[]{appraise, bluff, craft, fly, knowArcana, profession, spellcraft, useMagicDevice};
    public static Skill[] wizardSkills = new Skill[]{appraise, craft, fly, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, profession, spellcraft};

    //endregion
}
