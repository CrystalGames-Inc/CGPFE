package SpiritEngine.God.Creation.Player;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Skill.GameSkills;
import SpiritEngine.God.Creation.Importance.Skill.Skill;

public class PlayerSkills {

    private static PlayerSkills _instance;

    public static synchronized PlayerSkills getInstance(){
        if (_instance == null) {
            _instance = new PlayerSkills();
        }
        return _instance;
    }

    public PlayerSkills(){

    }

    GameSkills gameSkills = GameSkills.getInstance();

    //region Acrobatics

    PlayerSkill acrobatics = new PlayerSkill(
            gameSkills.acrobatics,
            new Class[]{
                    Class.BARBARIAN,
                    Class.BARD,
                    Class.MONK,
                    Class.ROGUE
            });

    //endregion

    //region Appraise

    PlayerSkill appraise = new PlayerSkill(
            gameSkills.appraise,
            new Class[]{
                    Class.ALCHEMIST,
                    Class.BARD,
                    Class.CLERIC,
                    Class.ROGUE,
                    Class.SORCERER,
                    Class.WIZARD
            });

    //endregion

    //region Bluff

    PlayerSkill bluff = new PlayerSkill(
            gameSkills.bluff,
            new Class[]{
                    Class.BARD,
                    Class.ROGUE,
                    Class.SORCERER
            });

    //endregion

    //region Climb

    PlayerSkill climb = new PlayerSkill(
            gameSkills.climb,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Craft

    PlayerSkill craft = new PlayerSkill(
            gameSkills.craft,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Diplomacy

    PlayerSkill diplomacy = new PlayerSkill(
            gameSkills.diplomacy,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Disable Device

    PlayerSkill disableDevice = new PlayerSkill(
            gameSkills.disableDevice,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Disguise

    PlayerSkill disguise = new PlayerSkill(
            gameSkills.disguise,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Escape Artist

    PlayerSkill escapeArtist = new PlayerSkill(
            gameSkills.escapeArtist,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Fly

    PlayerSkill fly = new PlayerSkill(
            gameSkills.fly,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Handle Animal

    PlayerSkill handleAnimal = new PlayerSkill(
            gameSkills.handleAnimal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Heal

    PlayerSkill heal = new PlayerSkill(
            gameSkills.heal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Intimidate

    PlayerSkill intimidate = new PlayerSkill(
            gameSkills.intimidate,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER
            });

    //endregion

    //region Knowledge (Arcana)

    PlayerSkill knowArcana = new PlayerSkill(
            gameSkills.knowArcana,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Dungeoneering)

    PlayerSkill knowDungeoneering = new PlayerSkill(
            gameSkills.knowDungeoneering,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Engineering)

    PlayerSkill knowEngineering = new PlayerSkill(
            gameSkills.knowEngineering,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Geography)

    PlayerSkill knowGeography = new PlayerSkill(
            gameSkills.knowGeography,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (History)

    PlayerSkill knowHistory = new PlayerSkill(
            gameSkills.knowHistory,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Local)

    PlayerSkill knowLocal = new PlayerSkill(
            gameSkills.knowLocal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Nature)

    PlayerSkill knowNature = new PlayerSkill(
            gameSkills.knowNature,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Nobility)

    PlayerSkill knowNobility = new PlayerSkill(
            gameSkills.knowNobility,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Planes)

    PlayerSkill knowPlanes = new PlayerSkill(
            gameSkills.knowPlanes,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Religion)

    PlayerSkill knowReligion = new PlayerSkill(
            gameSkills.knowReligion,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Linguistics

    PlayerSkill linguistics = new PlayerSkill(
            gameSkills.linguistics,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Perception

    PlayerSkill perception = new PlayerSkill(
            gameSkills.perception,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Perform

    PlayerSkill perform = new PlayerSkill(
            gameSkills.perform,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Profession

    PlayerSkill profession = new PlayerSkill(
            gameSkills.profession,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Ride

    PlayerSkill ride = new PlayerSkill(
            gameSkills.ride,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Sense Motive

    PlayerSkill senseMotive = new PlayerSkill(
            gameSkills.senseMotive,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Sleight Of Hand

    PlayerSkill sleightOfHand = new PlayerSkill(
            gameSkills.sleightOfHand,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Spellcraft

    PlayerSkill spellcraft = new PlayerSkill(
            gameSkills.spellcraft,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Stealth

    PlayerSkill stealth = new PlayerSkill(
            gameSkills.stealth,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Survival

    PlayerSkill survival = new PlayerSkill(
            gameSkills.survival,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Swim

    PlayerSkill swim = new PlayerSkill(
            gameSkills.swim,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Use Magic Device

    PlayerSkill useMagicDevice = new PlayerSkill(
            gameSkills.useMagicDevice,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    Class.SORCERER
            });

    //endregion


    public final PlayerSkill[] alchemistSkills = new PlayerSkill[]{
            appraise,
            craft,
            disableDevice,
            fly,
            heal,
            knowArcana,
            knowNature,
            perception,
            profession,
            sleightOfHand,
            spellcraft,
            survival,
            useMagicDevice
    };

    public final PlayerSkill[] barbarianSkills = new PlayerSkill[]{
            acrobatics,
            climb,
            craft,
            handleAnimal,
            intimidate,
            knowNature,
            perception,
            ride,
            survival,
            swim
    };
    public final PlayerSkill[] bardSkills = new PlayerSkill[]{
            acrobatics,
            appraise,
            bluff,
            climb,
            craft,
            diplomacy,
            disguise,
            escapeArtist,
            intimidate,
            knowArcana,
            knowDungeoneering,
            knowEngineering,
            knowGeography,
            knowHistory,
            knowLocal,
            knowNature,
            knowNobility,
            knowPlanes,
            knowReligion,
            linguistics,
            perception,
            perform,
            profession,
            senseMotive,
            sleightOfHand,
            spellcraft,
            stealth,
            useMagicDevice
    };

    public final PlayerSkill[] cavalierSkills = new PlayerSkill[]{
            bluff,
            climb,
            craft,
            diplomacy,
            handleAnimal,
            intimidate,
            profession,
            ride,
            senseMotive,
            swim
    };

    public final PlayerSkill[] clericSkills = new PlayerSkill[]{
            appraise,
            craft,
            diplomacy,
            heal,
            knowArcana,
            knowHistory,
            knowNobility,
            knowPlanes,
            knowReligion,
            linguistics,
            profession,
            senseMotive,
            spellcraft
    };

    public final PlayerSkill[] druidSkills = new PlayerSkill[]{
            climb,
            craft,
            fly,
            handleAnimal,
            heal,
            knowEngineering,
            knowGeography,
            knowNature,
            perception,
            profession,
            ride,
            spellcraft,
            survival,
            swim
    };

    public final PlayerSkill[] fighterSkills = new PlayerSkill[]{
            craft,
            intimidate,
            knowDungeoneering,
            profession,
            ride
    };

    public final PlayerSkill[] inquisitorSkills = new PlayerSkill[]{
            bluff,
            climb,
            craft,
            diplomacy,
            disguise,
            heal,
            intimidate,
            knowArcana,
            knowDungeoneering,
            knowNature,
            knowPlanes,
            knowReligion,
            perception,
            profession,
            ride,
            senseMotive,
            spellcraft,
            stealth,
            survival,
            swim
    };

    public final PlayerSkill[] monkSkills = new PlayerSkill[]{
            acrobatics,
            craft,
            intimidate,
            knowHistory,
            knowNobility,
            knowReligion,
            perception,
            perform,
            profession,
            ride,
            senseMotive,
            stealth,
            swim
    };

    public final PlayerSkill[] oracleSkills = new PlayerSkill[]{
            craft,
            diplomacy,
            heal,
            knowHistory,
            knowPlanes,
            knowReligion,
            profession,
            senseMotive,
            spellcraft
    };

    public final PlayerSkill[] paladinSkills = new PlayerSkill[]{
            craft,
            handleAnimal,
            heal,
            intimidate,
            knowDungeoneering,
            knowEngineering,
            knowGeography,
            knowNature,
            knowReligion,
            profession,
            ride,
            spellcraft,
            survival,
            swim
    };

    public final PlayerSkill[] rangerSkills = new PlayerSkill[]{
            climb,
            craft,
            handleAnimal,
            heal,
            intimidate,
            knowDungeoneering,
            knowLocal,
            perception,
            profession,
            ride,
            spellcraft,
            stealth,
            swim
    };

    public final PlayerSkill[] rogueSkills = new PlayerSkill[]{
            acrobatics,
            appraise,
            bluff,
            climb,
            craft,
            diplomacy,
            disableDevice,
            disguise,
            escapeArtist,
            intimidate,
            knowArcana,
            linguistics,
            perception,
            perform,
            profession,
            senseMotive,
            sleightOfHand,
            stealth,
            useMagicDevice
    };

    public final PlayerSkill[] sorcererSkills = new PlayerSkill[]{
            appraise,
            bluff,
            craft,
            fly,
            knowArcana,
            profession,
            spellcraft,
            useMagicDevice
    };

    public final PlayerSkill[] summonerSkills = new PlayerSkill[]{
            craft,
            fly,
            handleAnimal,
            knowArcana,
            knowDungeoneering,
            knowEngineering,
            knowGeography,
            knowHistory,
            knowLocal,
            knowNature,
            knowNobility,
            knowPlanes,
            knowReligion,
            linguistics,
            profession,
            ride,
            spellcraft,
            useMagicDevice
    };

    public final PlayerSkill[] witchSkills = new PlayerSkill[]{
            craft,
            fly,
            heal,
            intimidate,
            knowArcana,
            knowHistory,
            knowNature,
            knowPlanes,
            profession,
            spellcraft,
            useMagicDevice
    };

    public final PlayerSkill[] wizardSkills = new PlayerSkill[]{
            appraise,
            craft,
            fly,
            knowArcana,
            knowDungeoneering,
            knowEngineering,
            knowGeography,
            knowHistory,
            knowLocal,
            knowNature,
            knowNobility,
            knowPlanes,
            knowReligion,
            profession,
            spellcraft
    };
}
