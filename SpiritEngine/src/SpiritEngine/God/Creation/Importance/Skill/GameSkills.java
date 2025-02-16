package SpiritEngine.God.Creation.Importance.Skill;

import SpiritEngine.God.Creation.Importance.Skill.Skills.*;

public class GameSkills {


    private static GameSkills _instance;

    public static synchronized GameSkills getInstance(){
        if (_instance == null) {
            _instance = new GameSkills();
        }
        return _instance;
    }

    private GameSkills(){

    }

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

    //region NPC Skill arrays

    public final Skill[] adeptSkills = new Skill[]{
            craft,
            handleAnimal,
            heal,
            profession,
            spellcraft,
            survival
    };

    public final Skill[] aristocratSkills = new Skill[]{
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

    public final Skill[] commonerSkills = new Skill[]{
            climb,
            craft,
            handleAnimal,
            perception,
            profession,
            ride,
            swim
    };

    //Since The Expert can choose 10 skills, add them when creating the NPC

    public final Skill[] warriorSkills = new Skill[]{
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