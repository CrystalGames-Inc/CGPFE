package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;

public class Skills {

    //region Skills

    public final Skill acrobatics = new Acrobatics();
    public final Skill appraise = new Appraise();
    public final Skill bluff = new Bluff();
    public final Skill climb = new Climb();
    public final Skill craft = new Craft();
    public final Skill diplomacy = new Diplomacy();
    public final Skill disableDevice = new DisableDevice();
    public final Skill disguise = new Disguise();
    public final Skill escapeArtist = new EscapeArtist();
    public final Skill fly = new Fly();
    public final Skill handleAnimal = new HandleAnimal();
    public final Skill heal = new Heal();
    public final Skill intimidate = new Intimidate();
    public final Skill knowArcana = new KnowArcana();
    public final Skill knowDungeoneering = new KnowDungeoneering();
    public final Skill knowEngineering = new KnowEngineering();
    public final Skill knowGeography = new KnowGeography();
    public final Skill knowHistory = new KnowHistory();
    public final Skill knowLocal = new KnowLocal();
    public final Skill knowNature = new KnowNature();
    public final Skill knowNobility = new KnowNobility();
    public final Skill knowPlanes = new KnowPlanes();
    public final Skill knowReligion = new KnowReligion();
    public final Skill linguistics = new Linguistics();
    public final Skill perception = new Perception();
    public final Skill perform = new Perform();
    public final Skill profession = new Profession();
    public final Skill ride = new Ride();
    public final Skill senseMotive = new SenseMotive();
    public final Skill sleightOfHand = new SleightOfHand();
    public final Skill spellcraft = new Spellcraft();
    public final Skill stealth = new Stealth();
    public final Skill survival = new Survival();
    public final Skill swim = new Swim();
    public final Skill useMagicDevice = new UseMagicDevice();

    //endregion

    //region Class-Specific Skill Arrays

    public Skill[] barbarianSkills = new Skill[]{acrobatics, climb, craft, handleAnimal, intimidate, knowNature, perception, ride, survival, swim};
    public Skill[] bardSkills = new Skill[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disguise, escapeArtist, intimidate, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, linguistics, perception, perform, profession, senseMotive, sleightOfHand, spellcraft, stealth, useMagicDevice};
    public Skill[] clericSkills = new Skill[]{appraise, craft, diplomacy, heal, knowArcana, knowHistory, knowNobility, knowPlanes, knowReligion, linguistics, profession, senseMotive, spellcraft};
    public Skill[] druidSkills = new Skill[]{climb, craft, fly, handleAnimal, heal, knowEngineering, knowGeography, knowNature, perception, profession, ride, spellcraft, survival, swim};
    public Skill[] fighterSkills = new Skill[]{craft, intimidate, knowDungeoneering, profession, ride};
    public Skill[] monkSkills = new Skill[]{acrobatics, craft, intimidate, knowHistory, knowNobility, knowReligion, perception, perform, profession, ride, senseMotive, stealth, swim};
    public Skill[] paladinSkills = new Skill[]{craft, handleAnimal, heal, intimidate, knowDungeoneering, knowEngineering, knowGeography, knowNature, knowReligion, profession, ride, spellcraft, survival, swim};
    public Skill[] rangerSkills = new Skill[]{climb, craft, handleAnimal, heal, intimidate, knowDungeoneering, knowLocal, perception, profession, ride, spellcraft, stealth, swim};
    public Skill[] rogueSkills = new Skill[]{acrobatics, appraise, bluff, climb, craft, diplomacy, disableDevice, disguise, escapeArtist, intimidate, knowArcana, linguistics, perception, perform, profession, senseMotive, sleightOfHand, stealth, useMagicDevice};
    public Skill[] sorcererSkills = new Skill[]{appraise, bluff, craft, fly, knowArcana, profession, spellcraft, useMagicDevice};
    public Skill[] wizardSkills = new Skill[]{appraise, craft, fly, knowArcana, knowDungeoneering, knowEngineering, knowGeography, knowHistory, knowLocal, knowNature, knowNobility, knowPlanes, knowReligion, profession, spellcraft};

    //endregion

    //region NPC Skill arrays

    public Skill[] adeptSkills = new Skill[]{craft, handleAnimal, heal, profession, spellcraft, survival};
    public Skill[] aristocratSkills = new Skill[]{appraise, bluff, craft, diplomacy, disguise, handleAnimal, intimidate, linguistics, perception, perform, profession, ride, senseMotive, survival, swim};
    public Skill[] commonerSkills = new Skill[]{climb, craft, handleAnimal, perception, profession, ride, swim};
    //Since The Expert can choose 10 skills, add them when creating the NPC
    public Skill[] warriorSkills = new Skill[]{climb, craft, handleAnimal, intimidate, profession, ride, swim};
    //endregion
}