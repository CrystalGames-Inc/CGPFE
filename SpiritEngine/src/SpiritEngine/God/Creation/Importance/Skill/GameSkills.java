package SpiritEngine.God.Creation.Importance.Skill;

import SpiritEngine.God.Creation.Importance.Skill.Skills.*;

public class GameSkills {
    //region Skills

    public static final Skill acrobatics = new Acrobatics();
    public static final Skill appraise = new Appraise();
    public static final Skill bluff = new Bluff();
    public static final Skill climb = new Climb();
    public static final Skill craft = new Craft();
    public static final Skill diplomacy = new Diplomacy();
    public static final Skill disableDevice = new DisableDevice();
    public static final Skill disguise = new Disguise();
    public static final Skill escapeArtist = new EscapeArtist();
    public static final Skill fly = new Fly();
    public static final Skill handleAnimal = new HandleAnimal();
    public static final Skill heal = new Heal();
    public static final Skill intimidate = new Intimidate();
    public static final Skill knowArcana = new KnowArcana();
    public static final Skill knowDungeoneering = new KnowDungeoneering();
    public static final Skill knowEngineering = new KnowEngineering();
    public static final Skill knowGeography = new KnowGeography();
    public static final Skill knowHistory = new KnowHistory();
    public static final Skill knowLocal = new KnowLocal();
    public static final Skill knowNature = new KnowNature();
    public static final Skill knowNobility = new KnowNobility();
    public static final Skill knowPlanes = new KnowPlanes();
    public static final Skill knowReligion = new KnowReligion();
    public static final Skill linguistics = new Linguistics();
    public static final Skill perception = new Perception();
    public static final Skill perform = new Perform();
    public static final Skill profession = new Profession();
    public static final Skill ride = new Ride();
    public static final Skill senseMotive = new SenseMotive();
    public static final Skill sleightOfHand = new SleightOfHand();
    public static final Skill spellcraft = new Spellcraft();
    public static final Skill stealth = new Stealth();
    public static final Skill survival = new Survival();
    public static final Skill swim = new Swim();
    public static final Skill useMagicDevice = new UseMagicDevice();

    //endregion

    //region NPC Skill arrays

    public static final Skill[] adeptSkills = new Skill[]{
            craft,
            handleAnimal,
            heal,
            profession,
            spellcraft,
            survival
    };

    public static final Skill[] aristocratSkills = new Skill[]{
            appraise,
            bluff,
            craft,
            diplomacy,
            disguise,
            handleAnimal,
            intimidate,
            linguistics,
            perception,
            perform,
            profession,
            ride,
            senseMotive,
            survival,
            swim
    };

    public static final Skill[] commonerSkills = new Skill[]{
            climb,
            craft,
            handleAnimal,
            perception,
            profession,
            ride,
            swim
    };

    //Since The Expert can choose 10 skills, add them when creating the NPC

    public static final Skill[] warriorSkills = new Skill[]{
            climb,
            craft,
            handleAnimal,
            intimidate,
            profession,
            ride,
            swim
    };
    //endregion
}