package SpiritEngine.Management;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.EntitySkill;
import SpiritEngine.Game.Mechanics.Player.InventoryItem;
import SpiritEngine.Game.Mechanics.Dice;
import SpiritEngine.God.Creation.Entity.Additional.EntityWallet;
import SpiritEngine.God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import SpiritEngine.God.Creation.Entity.Mandatory.EntityAttributes;
import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Gender;
import SpiritEngine.God.Creation.Importance.Constants.Race;
import SpiritEngine.Game.Data.Storage.God.Creation.Skills;
import SpiritEngine.God.Creation.Player.Player;
import SpiritEngine.God.Creation.Player.PlayerInfo;
import Story.Data.*;

import java.util.Scanner;

public class PlayerDataMgr {

    //region Variables

    StoryData storyData = new StoryData();
    CommandMgr cmdMgr = CommandMgr.getInstance();
    Dice dice = new Dice();

    Scanner input = new Scanner(System.in);

    public Player player = new Player(
            new PlayerInfo("PLACEHOLDER", Gender.MALE, Alignment.NEUTRAL, 12, Race.PLACEHOLDER, Class.PLACEHOLDER, 1,0,0,0,0, new EntitySkill[]{}),
            new EntityAttributes(0,0,0,0,0,0,0),
            new EntityAttributeModifiers(0,0,0,0,0,0,0),
            new EntityWallet(0,0,0,0),
            new InventoryItem[210]);

    int[] abilities = {
        player.attributes.Strength,
        player.attributes.Dexterity,
        player.attributes.Constitution,
        player.attributes.Intelligence,
        player.attributes.Wisdom,
        player.attributes.Charisma
    };


    int[] abilityMods = {0, 0, 0, 0, 0, 0};

    int xpForNextLvl;
    int spendableFeatPts;
    int spendableAbilityPts;
    int spendableAbilityScorePts;


    private static PlayerDataMgr _instance = null;

    //endregion

    private PlayerDataMgr(){

    }

    public static synchronized PlayerDataMgr getInstance(){
        if(_instance == null)
            _instance = new PlayerDataMgr();

        return _instance;
    }

    //region Player Registration

    public void registerNewPlayer(Player player){
        registerPlayerInfo();
        player = this.player;
    }

    void registerPlayerInfo(){

        registerPlayerName();

        calculateAbilityScorePoints();

        registerPlayerGender();

        registerPlayerRace();

        registerPlayerClass();

        registerPlayerAlignment();

        calculateHealth();

        calculatePlayerAge();
    }

    void registerPlayerName(){
        System.out.println("Please choose your character's name: ");
        String name = input.nextLine();
        if(name == null){
            System.out.println("Please enter a name");
            cmdMgr.wait(500);
            cmdMgr.cls();
            registerPlayerName();
        }
    }

    void registerPlayerGender(){
        System.out.println("Please select your character's gender:\nMale\nFemale\n");
        String gender = input.nextLine();
        switch (gender.toUpperCase()){
            case "MALE":
                player.info.gender = Gender.MALE;
                break;
            case "FEMALE":
                player.info.gender = Gender.FEMALE;
                break;
            default:
                System.out.println("Invalid gender selected\n");
                cmdMgr.cls();
                registerPlayerGender();
                break;
        }
        cmdMgr.cls();
    }

    void registerPlayerAlignment(){
        String alignmentIn;
        switch (player.info.pClass){
            case BARBARIAN -> {
                System.out.println("Please Select An Alignment:\nNeutralGood\nChaoticGood\nNeutral\nChaoticNeutral\nNeutralEvil\nChaoticEvil");
                alignmentIn = input.nextLine();
                switch (alignmentIn.toUpperCase()){
                    case "NEUTRALGOOD" -> player.info.alignment = Alignment.NEUTRALGOOD;
                    case "CHAOTICGOOD" -> player.info.alignment = Alignment.CHAOTICGOOD;
                    case "NEUTRAL" -> player.info.alignment = Alignment.NEUTRAL;
                    case "CHAOTICNEUTRAL" -> player.info.alignment = Alignment.CHAOTICNEUTRAL;
                    case "NEUTRALEVIL" -> player.info.alignment = Alignment.NEUTRALEVIL;
                    case "CHAOTICEVIL" -> player.info.alignment = Alignment.CHAOTICEVIL;
                }
            }
            case BARD, CLERIC, FIGHTER, RANGER, ROGUE, SORCERER, WIZARD -> {
                System.out.println("Please Select An Alignment:\nLawfulGood\nNeutralGood\nChaoticGood\nLawfulNeutral\nNeutral\nChaoticNeutral\nLawfulEvil\nNeutralEvil\nChaoticEvil");
                alignmentIn = input.nextLine();
                switch (alignmentIn.toUpperCase()){
                    case "LAWFULGOOD" -> player.info.alignment = Alignment.LAWFULGOOD;
                    case "NEUTRALGOOD" -> player.info.alignment = Alignment.NEUTRALGOOD;
                    case "CHAOTICGOOD" -> player.info.alignment = Alignment.CHAOTICGOOD;
                    case "LAWFULNEUTRAL" -> player.info.alignment = Alignment.LAWFULNEUTRAL;
                    case "NEUTRAL" -> player.info.alignment = Alignment.NEUTRAL;
                    case "CHAOTICNEUTRAL" -> player.info.alignment = Alignment.CHAOTICNEUTRAL;
                    case "LAWFULEVIL" -> player.info.alignment = Alignment.LAWFULEVIL;
                    case "NEUTRALEVIL" -> player.info.alignment = Alignment.NEUTRALEVIL;
                    case "CHAOTICEVIL" -> player.info.alignment = Alignment.CHAOTICEVIL;
                }
            } //Any
            case DRUID -> {
                System.out.println("Please Select An Alignment:\nNeutralGood\nLawfulNeutral\nNeutral\nChaoticNeutral\nNeutralEvil");
                alignmentIn = input.nextLine();
                switch (alignmentIn.toUpperCase()){
                    case "NEUTRALGOOD" -> player.info.alignment = Alignment.NEUTRALGOOD;
                    case "LAWFULNEUTRAL" -> player.info.alignment = Alignment.LAWFULNEUTRAL;
                    case "NEUTRAL" -> player.info.alignment = Alignment.NEUTRAL;
                    case "CHAOTICNEUTRAL" -> player.info.alignment = Alignment.CHAOTICNEUTRAL;
                    case "NEUTRALEVIL" -> player.info.alignment = Alignment.NEUTRALEVIL;
                }
            }
            case MONK -> {
                System.out.println("Please Select An Alignment:\nLawfulGood\nLawfulNeutral\nLawfulEvil");
                alignmentIn = input.nextLine();
                switch (alignmentIn.toUpperCase()){
                    case "LAWFULGOOD" -> player.info.alignment = Alignment.LAWFULGOOD;
                    case "LAWFULNEUTRAL" -> player.info.alignment = Alignment.LAWFULNEUTRAL;
                    case "LAWFULEVIL" -> player.info.alignment = Alignment.LAWFULEVIL;
                }
            }
            case PALADIN -> player.info.alignment = Alignment.LAWFULGOOD;
        }

        cmdMgr.cls();
    }

    void registerPlayerRace(){
        System.out.println("Please choose your character's race:\nDwarf\nElf\nGnome\nHalfElf\nHalfOrc\nHalfling\nHuman");
        String race = input.nextLine();
        cmdMgr.cls();

        switch (race.toUpperCase()){
            case("DWARF") -> {
                player.info.race = Race.DWARF;
                player.attributes.Constitution += 2;
                player.attributes.Wisdom += 2;
                player.attributes.Charisma -= 2;
                player.attributes.MoveSpeed = 20;
            }
            case("ELF") -> {
                player.info.race = Race.ELF;
                player.attributes.Dexterity += 2;
                player.attributes.Constitution -= 2;
                player.attributes.Intelligence += 2;
                player.attributes.MoveSpeed = 30;
            }
            case("GNOME") -> {
                player.info.race = Race.GNOME;
                player.attributes.Strength -= 2;
                player.attributes.Constitution += 2;
                player.attributes.Charisma += 2;
                player.attributes.MoveSpeed = 20;
            }
            case("HALFELF") -> {
                registerPlayerRaceStatMod();

                player.info.race = Race.HALFELF;
                player.attributes.MoveSpeed = 30;
            }
            case("HALFORC") -> {
                registerPlayerRaceStatMod();

                player.info.race = Race.HALFORC;
                player.attributes.MoveSpeed = 30;
            }
            case("HALFLING") -> {
                player.info.race = Race.HALFLING;
                player.attributes.Strength -= 2;
                player.attributes.Dexterity += 2;
                player.attributes.Charisma += 2;
                player.attributes.MoveSpeed = 20;
            }
            case("HUMAN") -> {
                registerPlayerRaceStatMod();

                player.info.race = Race.HUMAN;
                player.attributes.MoveSpeed = 30;
            }
            default -> {
                System.out.println("Invalid Race.");
                registerPlayerRace();
            }
        }
        cmdMgr.cls();
    }

    void registerPlayerRaceStatMod(){
        String raceStatMod;

        System.out.println("Please select the attribute you'd like to increase:\nStr(ength)\nDex(terity)\nCon(stitution)\nInt(elligence)\nWis(dom)\nCha(risma)");
        raceStatMod = input.nextLine();

        switch (raceStatMod.toUpperCase()){
            case("STR"), ("STRENGTH")     -> player.attributes.Strength += 2;
            case("DEX"), ("DEXTERITY")    -> player.attributes.Dexterity += 2;
            case("CON"), ("CONSTITUTION") -> player.attributes.Constitution += 2;
            case("INT"), ("INTELLIGENCE") -> player.attributes.Intelligence += 2;
            case("WIS"), ("WISDOM")       -> player.attributes.Wisdom += 2;
            case("CHA"), ("CHARISMA")     -> player.attributes.Charisma += 2;
            default -> {
                System.out.println("Invalid attribute selected");
                registerPlayerRaceStatMod();
            }
        }
    }

    void registerPlayerClass(){
        Skills skills = new Skills();

        System.out.println("Please choose your character's class:\nBarbarian\nBard\nCleric\nDruid\nFighter\nMonk\nPaladin\nRanger\nRogue\nSorcerer\nWizard");
        String pClass = input.nextLine();
        switch (pClass.toUpperCase()){
            case("BARBARIAN") -> {
                player.info.pClass = Class.BARBARIAN;
                player.info.skills = (EntitySkill[]) skills.barbarianSkills;
                player.wallet.GoldPieces = dice.Roll(6,3) * 10;
            }
            case("BARD") -> {
                player.info.pClass = Class.BARD;
                player.info.skills = (EntitySkill[]) skills.bardSkills;
                player.wallet.GoldPieces = dice.Roll(6,3) * 10;
            }
            case("CLERIC") -> {
                player.info.pClass = Class.CLERIC;
                player.info.skills =  (EntitySkill[]) skills.clericSkills;
                player.wallet.GoldPieces = dice.Roll(6,4) * 10;
            }
            case("DRUID") -> {
                player.info.pClass = Class.DRUID;
                player.info.skills = (EntitySkill[]) skills.druidSkills;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            case("FIGHTER") -> {
                player.info.pClass = Class.FIGHTER;
                player.info.skills = (EntitySkill[]) skills.fighterSkills;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("MONK") -> {
                player.info.pClass = Class.MONK;
                player.info.skills = (EntitySkill[]) skills.monkSkills;
                player.wallet.GoldPieces = dice.Roll(6) * 10;
            }
            case("PALADIN") -> {
                player.info.pClass = Class.PALADIN;
                player.info.skills = (EntitySkill[]) skills.paladinSkills;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("RANGER") -> {
                player.info.pClass = Class.RANGER;
                player.info.skills = (EntitySkill[]) skills.rangerSkills;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("ROGUE") -> {
                player.info.pClass = Class.ROGUE;
                player.info.skills = (EntitySkill[]) skills.rogueSkills;
                player.wallet.GoldPieces = dice.Roll(6,4) * 10;
            }
            case("SORCERER") -> {
                player.info.pClass = Class.SORCERER;
                player.info.skills = (EntitySkill[]) skills.sorcererSkills;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            case("WIZARD") -> {
                player.info.pClass = Class.WIZARD;
                player.info.skills = (EntitySkill[]) skills.wizardSkills;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            default ->{
                System.out.println("Invalid class.");
                registerPlayerClass();
            }
        }
        player.info.skills = calculateSkillsBonuses();

        cmdMgr.cls();

        player.info.health = player.info.maxHealth;
    }


    //endregion

    //region Data Calculations

    void calculatePlayerAge(){
        switch (player.info.race){
            case DWARF -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(6,3, 40);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,5,40);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,7,40);
                }
            }
            case ELF -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(6,4,110);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,6,110);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(10,6,110);
                }
            }
            case GNOME -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(6,4,40);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,6,40);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,9,40);
                }
            }
            case HALFELF -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(6,1,20);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,2,20);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,3,20);
                }
            }
            case HALFORC -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(4,1,14);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,1,14);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,2,14);
                }
            }
            case HALFLING -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(4,2,20);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,3,20);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,4,20);
                }
            }
            case HUMAN -> {
                switch (player.info.pClass){
                    case BARBARIAN, ROGUE, SORCERER -> player.info.age =     dice.Roll(4,1,15);
                    case BARD, FIGHTER, PALADIN, RANGER -> player.info.age = dice.Roll(6,1,15);
                    case CLERIC, DRUID, MONK, WIZARD -> player.info.age =    dice.Roll(6,2,15);
                }
            }
        }
    }

    void calculateHealth(){
        switch (player.info.pClass){
            case BARBARIAN -> player.info.maxHealth = 1 + 12 + player.attributes.Constitution;
            case BARD, CLERIC, DRUID, MONK, ROGUE -> player.info.maxHealth = 1 + 8 + player.attributes.Constitution;
            case FIGHTER, PALADIN, RANGER -> player.info.maxHealth = 1 + 10 + player.attributes.Constitution;
            case SORCERER, WIZARD ->player.info.maxHealth = 1 + 6 + player.attributes.Constitution;

        }
    }

    void calculateXPForNextLvl(){
        switch (storyData.gameSpeed){
            case SLOW -> {
                switch (player.info.level){
                    case 1 -> xpForNextLvl = 3000;
                    case 2 -> xpForNextLvl = 7500;
                    case 3 -> xpForNextLvl = 14000;
                    case 4 -> xpForNextLvl = 23000;
                    case 5 -> xpForNextLvl = 35000;
                    case 6 -> xpForNextLvl = 53000;
                    case 7 -> xpForNextLvl = 77000;
                    case 8 -> xpForNextLvl = 115000;
                    case 9 -> xpForNextLvl = 160000;
                    case 10 -> xpForNextLvl = 235000;
                    case 11 -> xpForNextLvl = 330000;
                    case 12 -> xpForNextLvl = 475000;
                    case 13 -> xpForNextLvl = 665000;
                    case 14 -> xpForNextLvl = 955000;
                    case 15 -> xpForNextLvl = 1350000;
                    case 16 -> xpForNextLvl = 1900000;
                    case 17 -> xpForNextLvl = 2700000;
                    case 18 -> xpForNextLvl = 3850000;
                    case 19 -> xpForNextLvl = 5350000;
                }
            }
            case MEDIUM -> {
                switch (player.info.level){
                    case 1 -> xpForNextLvl = 2000;
                    case 2 -> xpForNextLvl = 5000;
                    case 3 -> xpForNextLvl = 9000;
                    case 4 -> xpForNextLvl = 15000;
                    case 5 -> xpForNextLvl = 23000;
                    case 6 -> xpForNextLvl = 35000;
                    case 7 -> xpForNextLvl = 51000;
                    case 8 -> xpForNextLvl = 755000;
                    case 9 -> xpForNextLvl = 105000;
                    case 10 -> xpForNextLvl = 155000;
                    case 11 -> xpForNextLvl = 220000;
                    case 12 -> xpForNextLvl = 315000;
                    case 13 -> xpForNextLvl = 445000;
                    case 14 -> xpForNextLvl = 635000;
                    case 15 -> xpForNextLvl = 890000;
                    case 16 -> xpForNextLvl = 1300000;
                    case 17 -> xpForNextLvl = 1800000;
                    case 18 -> xpForNextLvl = 2550000;
                    case 19 -> xpForNextLvl = 3600000;
                }
            }
            case FAST -> {
                switch (player.info.level){
                    case 1 -> xpForNextLvl = 1300;
                    case 2 -> xpForNextLvl = 3300;
                    case 3 -> xpForNextLvl = 6000;
                    case 4 -> xpForNextLvl = 10000;
                    case 5 -> xpForNextLvl = 15000;
                    case 6 -> xpForNextLvl = 23000;
                    case 7 -> xpForNextLvl = 34000;
                    case 8 -> xpForNextLvl = 50000;
                    case 9 -> xpForNextLvl = 71000;
                    case 10 -> xpForNextLvl = 105000;
                    case 11 -> xpForNextLvl = 145000;
                    case 12 -> xpForNextLvl = 210000;
                    case 13 -> xpForNextLvl = 295000;
                    case 14 -> xpForNextLvl = 425000;
                    case 15 -> xpForNextLvl = 600000;
                    case 16 -> xpForNextLvl = 850000;
                    case 17 -> xpForNextLvl = 1200000;
                    case 18 -> xpForNextLvl = 1700000;
                    case 19 -> xpForNextLvl = 2400000;
                }
            }
        }
    }

    void calculateArmorClass(){
        player.info.armorClass = 10 + player.attributeMods.Dexterity;
    }

    EntitySkill[] calculateSkillsBonuses(){

        EntitySkill[] skills = new EntitySkill[player.info.skills.length];

        for(int i = 0; i < player.info.skills.length; i++){
            EntitySkill skill = new EntitySkill();
            skill.setSkill(player.info.skills[i]);
            switch (skill.getAbility()) {
                case STRENGTH -> skill.setSize(player.attributeMods.Strength);
                case DEXTERITY -> skill.setSize(player.attributeMods.Dexterity);
                case CONSTITUTION -> skill.setSize(player.attributeMods.Constitution);
                case INTELLIGENCE -> skill.setSize(player.attributeMods.Intelligence);
                case WISDOM -> skill.setSize(player.attributeMods.Wisdom);
                case CHARISMA -> skill.setSize(player.attributeMods.Charisma);
            }
            skills[i] = skill;
        }

        return skills;
    }

    //endregion

    //region Ability Points

    void calculateAbilityScorePoints(){
        switch (storyData.abilityScoreType){
            case STANDARD-> {
                for (int i = 0; i < 6; i++) {
                    int minIndex = 0;
                    int[] rolls = new int[]{
                            dice.Roll(6),
                            dice.Roll(6),
                            dice.Roll(6),
                            dice.Roll(6)
                    };
                    for (int j = 0; j < 3; j++) {
                        if(rolls[j] < rolls[j+1])
                            minIndex = j;
                    }
                    rolls[minIndex] = 0;
                    abilities[i] += rolls[0] + rolls[1] + rolls[2] + rolls[3];
                }
            }
            case CLASSIC -> {
                for (int i = 0; i < 6; i++) {
                    int[] rolls = new int[]{
                            dice.Roll(6),
                            dice.Roll(6),
                            dice.Roll(6)
                    };
                    abilities[i] = rolls[0] + rolls[1] + rolls[2];
                }
            }
            case HEROIC -> {
                for (int i = 0; i < 6; i++) {
                    int[] rolls = new int[]{
                            dice.Roll(6),
                            dice.Roll(6),
                    };
                    abilities[i] = rolls[0] + rolls[1] + 6;
                }
            }
            case PURCHASE -> {
                switch (storyData.gameFantasty) {
                    case LOW -> spendableAbilityPts = 10;
                    case STANDARD -> spendableAbilityPts = 15;
                    case HIGH -> spendableAbilityPts = 20;
                    case EPIC -> spendableAbilityPts = 25;
                }
                registerAbilityScorePoints();
            }
        }

        calculateAbilityModifiers();
        updateAbilityPoints();
    }

    //For the PURCHASE Point Generation Mod
    //TODO finish adding the PURCHASE case
    void registerAbilityScorePoints(){
        abilities = new int[]{10, 10, 10, 10, 10, 10};
        int amount;

        do{
            System.out.println("Please enter the Strength attribute you'd like to have (7-18) (" + spendableAbilityPts + " left):");
            amount = input.nextInt();

            switch (amount){
                case 7  -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 4;  abilities[0] =  7; } }
                case 8  -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 2;  abilities[0] =  8; } }
                case 9  -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 1;  abilities[0] =  9; } }
                case 10 ->   abilities[0] = 10;
                case 11 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 1;  abilities[0] =  11;} }
                case 12 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 2;  abilities[0] =  12;} }
                case 13 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 3;  abilities[0] =  13;} }
                case 14 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 5;  abilities[0] =  14;} }
                case 15 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 7;  abilities[0] =  15;} }
                case 16 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 10; abilities[0] = 16;} }
                case 17 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 13; abilities[0] = 17;} }
                case 18 -> { if (spendableAbilityPts - amount >= 0) {
                    spendableAbilityPts += 17; abilities[0] = 18;} }
                default -> System.out.println("Insufficient points left");
            }

        } while (amount >= 0);
    }

    void calculateAbilityModifiers(){
        for(int i = 0; i < abilities.length; i++){
            switch (abilities[i]){
                case 1 -> abilityMods[i] = -5;
                case 2,3 -> abilityMods[i] = -4;
                case 4,5 -> abilityMods[i] = -3;
                case 6,7 -> abilityMods[i] = -2;
                case 8,9 -> abilityMods[i] = -1;
                case 10,11 -> abilityMods[i] = 0;
                case 12,13 -> abilityMods[i] = 1;
                case 14,15 -> abilityMods[i] = 2;
                case 16,17 -> abilityMods[i] = 3;
                case 18,19 -> abilityMods[i] = 4;
                case 20,21 -> abilityMods[i] = 5;
                case 22,23 -> abilityMods[i] = 6;
                case 24,25 -> abilityMods[i] = 7;
                case 26,27 -> abilityMods[i] = 8;
                case 28,29 -> abilityMods[i] = 9;
                case 30,31 -> abilityMods[i] = 10;
            }
        }

        updateAbilityModifiers();
    }

    //endregion

    //region Data Updates

    void updateAbilityPoints(){
        player.attributes.Strength += abilities[0];
        player.attributes.Dexterity += abilities[1];
        player.attributes.Constitution += abilities[2];
        player.attributes.Intelligence += abilities[3];
        player.attributes.Wisdom += abilities[4];
        player.attributes.Charisma += abilities[5];

        abilities = new int[]{0, 0, 0, 0, 0, 0};
    }

    void updateAbilityModifiers(){
        player.attributeMods.Strength += abilityMods[0];
        player.attributeMods.Dexterity += abilityMods[1];
        player.attributeMods.Constitution += abilityMods[2];
        player.attributeMods.Intelligence += abilityMods[3];
        player.attributeMods.Wisdom += abilityMods[4];
        player.attributeMods.Charisma += abilityMods[5];

        abilityMods = new int[]{0, 0, 0, 0, 0, 0};
    }

    public void updatePlayerValues(Player player){
        this.player = player;
    }

    public void levelUp(){
        player.info.level++;

        if(player.info.level % 2 == 1)
            spendableFeatPts++;
        if(player.info.level % 4 == 0)
            spendableAbilityScorePts++;
    }

    //endregion

    //region Data Displays

    public void displayPlayerData(){
        System.out.println("|Player Info:");
        System.out.println("| Name      : " + player.info.name);
        System.out.println("| Gender    : " + player.info.gender);
        System.out.println("| Alignment : " + player.info.alignment);
        System.out.println("| Age       : " + player.info.age);
        System.out.println("| Race      : " + player.info.race);
        System.out.println("| Class     : " + player.info.pClass);
        System.out.println("| Level     : " + player.info.level);
        System.out.println("| XP        : " + player.info.xp);
        System.out.println("| Health    : " + player.info.health);
        System.out.println("| Max Health: " + player.info.maxHealth);
        System.out.println("\n| Skills: ");
        for(int i = 0; i < player.info.skills.length; i++)
            System.out.println("|  " + player.info.skills[i].getName());
        System.out.println("\n|Attributes:");
        System.out.println("|  Strength    : " + player.attributes.Strength);
        System.out.println("|  Dexterity   : " + player.attributes.Dexterity);
        System.out.println("|  Constitution: " + player.attributes.Constitution);
        System.out.println("|  Intelligence: " + player.attributes.Intelligence);
        System.out.println("|  Wisdom      : " + player.attributes.Wisdom);
        System.out.println("|  Charisma    : " + player.attributes.Charisma);
        System.out.println("|  Move Speed  : " + player.attributes.MoveSpeed);

        System.out.println("\n| Attribute Modifiers:");
        System.out.println("|  Strength    : " + player.attributeMods.Strength);
        System.out.println("|  Dexterity   : " + player.attributeMods.Dexterity);
        System.out.println("|  Constitution: " + player.attributeMods.Constitution);
        System.out.println("|  Intelligence: " + player.attributeMods.Intelligence);
        System.out.println("|  Wisdom      : " + player.attributeMods.Wisdom);
        System.out.println("|  Charisma    : " + player.attributeMods.Charisma);
        System.out.println("|  Move Speed  : " + player.attributeMods.MoveSpeed);

        System.out.println("\n| Wallet:");
        System.out.println("|  Copper Pieces  : " + player.wallet.CopperPieces);
        System.out.println("|  Silver Pieces  : " + player.wallet.SilverPieces);
        System.out.println("|  Gold Pieces    : " + player.wallet.GoldPieces);
        System.out.println("|  Platinum Pieces: " + player.wallet.PlatinumPieces);
    }

    public void displayPlayerInventory(){
        System.out.println("|Player Inventory:");
        for (InventoryItem item: player.inventory) {
            System.out.println("  |" + item.name + ": ");
            System.out.println("    |" + item.itemId);
            System.out.println("    |" + item.inventoryId);
            System.out.println("    |" + item.amount);
            System.out.println("    |" + item.maxCapacity);
        }
    }

    //endregion
}