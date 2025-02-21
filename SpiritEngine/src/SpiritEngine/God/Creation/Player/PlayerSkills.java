package SpiritEngine.God.Creation.Player;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Skill.GameSkills;
import SpiritEngine.God.Creation.Importance.Skill.Skill;

public class PlayerSkills {
    //region Acrobatics

    public static final PlayerSkill acrobatics = new PlayerSkill(
            GameSkills.acrobatics,
            new Class[]{
                    Class.BARBARIAN,
                    Class.BARD,
                    Class.MONK,
                    Class.ROGUE
            });

    //endregion

    //region Appraise

    public static final PlayerSkill appraise = new PlayerSkill(
            GameSkills.appraise,
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

    public static final PlayerSkill bluff = new PlayerSkill(
            GameSkills.bluff,
            new Class[]{
                    Class.BARD,
                    Class.ROGUE,
                    Class.SORCERER
            });

    //endregion

    //region Climb

    public static final PlayerSkill climb = new PlayerSkill(
            GameSkills.climb,
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

    public static final PlayerSkill craft = new PlayerSkill(
            GameSkills.craft,
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

    public static final PlayerSkill diplomacy = new PlayerSkill(
            GameSkills.diplomacy,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Disable Device

    public static final PlayerSkill disableDevice = new PlayerSkill(
            GameSkills.disableDevice,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Disguise

    public static final PlayerSkill disguise = new PlayerSkill(
            GameSkills.disguise,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Escape Artist

    public static final PlayerSkill escapeArtist = new PlayerSkill(
            GameSkills.escapeArtist,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Fly

    public static final PlayerSkill fly = new PlayerSkill(
            GameSkills.fly,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Handle Animal

    public static final PlayerSkill handleAnimal = new PlayerSkill(
            GameSkills.handleAnimal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Heal

    public static final PlayerSkill heal = new PlayerSkill(
            GameSkills.heal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER
            });

    //endregion

    //region Intimidate

    public static final PlayerSkill intimidate = new PlayerSkill(
            GameSkills.intimidate,
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

    public static final PlayerSkill knowArcana = new PlayerSkill(
            GameSkills.knowArcana,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.SORCERER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Dungeoneering)

    public static final PlayerSkill knowDungeoneering = new PlayerSkill(
            GameSkills.knowDungeoneering,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Engineering)

    public static final PlayerSkill knowEngineering = new PlayerSkill(
            GameSkills.knowEngineering,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.FIGHTER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Geography)

    public static final PlayerSkill knowGeography = new PlayerSkill(
            GameSkills.knowGeography,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (History)

    public static final PlayerSkill knowHistory = new PlayerSkill(
            GameSkills.knowHistory,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Local)

    public static final PlayerSkill knowLocal = new PlayerSkill(
            GameSkills.knowLocal,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Nature)

    public static final PlayerSkill knowNature = new PlayerSkill(
            GameSkills.knowNature,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARBARIAN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.DRUID,
                    SpiritEngine.God.Creation.Importance.Constants.Class.RANGER,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Nobility)

    public static final PlayerSkill knowNobility = new PlayerSkill(
            GameSkills.knowNobility,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Planes)

    public static final PlayerSkill knowPlanes = new PlayerSkill(
            GameSkills.knowPlanes,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Knowledge (Religion)

    public static final PlayerSkill knowReligion = new PlayerSkill(
            GameSkills.knowReligion,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.PALADIN,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Linguistics

    public static final PlayerSkill linguistics = new PlayerSkill(
            GameSkills.linguistics,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.CLERIC,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE,
                    SpiritEngine.God.Creation.Importance.Constants.Class.WIZARD
            });

    //endregion

    //region Perception

    public static final PlayerSkill perception = new PlayerSkill(
            GameSkills.perception,
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

    public static final PlayerSkill perform = new PlayerSkill(
            GameSkills.perform,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    SpiritEngine.God.Creation.Importance.Constants.Class.BARD,
                    SpiritEngine.God.Creation.Importance.Constants.Class.MONK,
                    SpiritEngine.God.Creation.Importance.Constants.Class.ROGUE
            });

    //endregion

    //region Profession

    public static final PlayerSkill profession = new PlayerSkill(
            GameSkills.profession,
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

    public static final PlayerSkill ride = new PlayerSkill(
            GameSkills.ride,
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

    public static final PlayerSkill senseMotive = new PlayerSkill(
            GameSkills.senseMotive,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARD,
                    Class.CLERIC,
                    Class.MONK,
                    Class.PALADIN,
                    Class.ROGUE
            });

    //endregion

    //region Sleight Of Hand

    public static final PlayerSkill sleightOfHand = new PlayerSkill(
            GameSkills.sleightOfHand,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARD,
                    Class.ROGUE
            });

    //endregion

    //region Spellcraft

    public static final PlayerSkill spellcraft = new PlayerSkill(
            GameSkills.spellcraft,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARD,
                    Class.CLERIC,
                    Class.DRUID,
                    Class.PALADIN,
                    Class.RANGER,
                    Class.SORCERER,
                    Class.WIZARD
            });

    //endregion

    //region Stealth

    public static final PlayerSkill stealth = new PlayerSkill(
            GameSkills.stealth,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARD,
                    Class.MONK,
                    Class.RANGER,
                    Class.ROGUE
            });

    //endregion

    //region Survival

    public static final PlayerSkill survival = new PlayerSkill(
            GameSkills.survival,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARBARIAN,
                    Class.DRUID,
                    Class.FIGHTER,
                    Class.RANGER
            });

    //endregion

    //region Swim

    public static final PlayerSkill swim = new PlayerSkill(
            GameSkills.swim,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARBARIAN,
                    Class.DRUID,
                    Class.FIGHTER,
                    Class.MONK,
                    Class.RANGER,
                    Class.ROGUE
            });

    //endregion

    //region Use Magic Device

    public static final PlayerSkill useMagicDevice = new PlayerSkill(
            GameSkills.useMagicDevice,
            new SpiritEngine.God.Creation.Importance.Constants.Class[]{
                    Class.BARD,
                    Class.ROGUE,
                    Class.SORCERER
            });

    //endregion


    public static final PlayerSkill[] alchemistSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] barbarianSkills = new PlayerSkill[]{
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
    public static final PlayerSkill[] bardSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] cavalierSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] clericSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] druidSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] fighterSkills = new PlayerSkill[]{
            craft,
            intimidate,
            knowDungeoneering,
            profession,
            ride
    };

    public static final PlayerSkill[] inquisitorSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] monkSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] oracleSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] paladinSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] rangerSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] rogueSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] sorcererSkills = new PlayerSkill[]{
            appraise,
            bluff,
            craft,
            fly,
            knowArcana,
            profession,
            spellcraft,
            useMagicDevice
    };

    public static final PlayerSkill[] summonerSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] witchSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] wizardSkills = new PlayerSkill[]{
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

    public static final PlayerSkill[] playerSkills = new PlayerSkill[]{
            acrobatics,
            appraise,
            bluff,
            climb,
            craft,
            diplomacy,
            disableDevice,
            disguise,
            escapeArtist,
            fly,
            handleAnimal,
            heal,
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
            ride,
            senseMotive,
            spellcraft,
            stealth,
            survival,
            swim,
            useMagicDevice
    };
}
