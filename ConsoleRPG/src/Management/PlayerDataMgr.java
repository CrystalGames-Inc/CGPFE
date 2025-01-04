package Management;

import Display.Windows.SkillWindow;
import Game.Data.Models.God.Creation.Skill;
import Game.Mechanics.Player.InventoryItem;
import Game.Mechanics.Dice;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Importance.Constants.Alignment;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Gender;
import God.Creation.Importance.Constants.Race;
import Game.Data.Storage.God.Creation.SkillsTemp;
import God.Creation.Player.Player;
import God.Creation.Player.PlayerInfo;

import java.util.Scanner;

public class PlayerDataMgr {

    public CommandMgr cmdMgr = CommandMgr.getInstance();

    public Dice dice = new Dice();

    public Scanner input = new Scanner(System.in);

    public Player player = new Player(new PlayerInfo("PLACEHOLDER", Gender.MALE, Alignment.NEUTRAL, 12, Race.PLACEHOLDER, Class.PLACEHOLDER, 0,0,0,0, new Skill[]{}), new EntityAttributes(0,0,0,0,0,0,0), new EntityAttributeModifiers(0,0,0,0,0,0,0), new EntityWallet(0,0,0,0), new InventoryItem[210]);

    private static PlayerDataMgr _instance = null;

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

    public void registerPlayerInfo(){
        System.out.println("Please choose your character's name: ");
        player.info.name = input.nextLine();
        cmdMgr.cls();

        registerPlayerGender();

        registerPlayerAlignment();

        registerPlayerRace();

        registerPlayerClass();

        calculatePlayerAge();
    }

    public void registerPlayerGender(){
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

    public void registerPlayerAlignment(){
        System.out.println("Please Select Your Character's Alignment:\nLawfulGood\nNeutralGood\nChaoticGood\nLawfulNeutral\nNeutral\nChaoticNeutral\nLawfulEvil\nNeutralEvil\nChaoticEvil");
        String alignment = input.nextLine();
        switch (alignment.toUpperCase()){
            case "LAWFULGOOD" -> player.info.alignment = Alignment.LAWFULGOOD;
            case "NEUTRALGOOD" -> player.info.alignment = Alignment.NEUTRALGOOD;
            case "CHAOTICGOOD" -> player.info.alignment = Alignment.CHAOTICGOOD;
            case "LAWFULNEUTRAL" -> player.info.alignment = Alignment.LAWFULNEUTRAL;
            case "NEUTRAL" -> player.info.alignment = Alignment.NEUTRAL;
            case "CHAOTICNEUTRAL" -> player.info.alignment = Alignment.CHAOTICNEUTRAL;
            case "LAWFULEVIL" -> player.info.alignment = Alignment.LAWFULEVIL;
            case "NEUTRALEVIL" -> player.info.alignment = Alignment.NEUTRALEVIL;
            case "CHAOTICEVIL" -> player.info.alignment = Alignment.CHAOTICEVIL;
            default -> {
                System.out.println("Invalid alignment selected");
                cmdMgr.cls();
                registerPlayerAlignment();
            }
        }

        cmdMgr.cls();
    }

    public void registerPlayerRace(){
        System.out.println("Please choose your character's race:\nDwarf\nElf\nGnome\nHalfElf\nHalfOrc\nHalfling\nHuman");
        String race = input.nextLine();
        cmdMgr.cls();

        switch (race.toUpperCase()){
            case("DWARF") -> {
                player.info.race = Race.DWARF;
                player.attributeMods.Constitution += 2;
                player.attributeMods.Wisdom += 2;
                player.attributeMods.Charisma -= 2;
                player.attributes.MoveSpeed = 20;
            }
            case("ELF") -> {
                player.info.race = Race.ELF;
                player.attributeMods.Dexterity += 2;
                player.attributeMods.Constitution -= 2;
                player.attributeMods.Intelligence += 2;
                player.attributes.MoveSpeed = 30;
            }
            case("GNOME") -> {
                player.info.race = Race.GNOME;
                player.attributeMods.Strength -= 2;
                player.attributeMods.Constitution += 2;
                player.attributeMods.Charisma += 2;
                player.attributes.MoveSpeed = 20;
            }
            case("HALFELF") -> {
                registerPlayerStatMod();

                player.info.race = Race.HALFELF;
                player.attributes.MoveSpeed = 30;
            }
            case("HALFORC") -> {
                registerPlayerStatMod();

                player.info.race = Race.HALFORC;
                player.attributes.MoveSpeed = 30;
            }
            case("HALFLING") -> {
                player.info.race = Race.HALFLING;
                player.attributeMods.Strength -= 2;
                player.attributeMods.Dexterity += 2;
                player.attributeMods.Charisma += 2;
                player.attributes.MoveSpeed = 20;
            }
            case("HUMAN") -> {
                registerPlayerStatMod();

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

    public void registerPlayerStatMod(){
        String raceStatMod;

        System.out.println("Please select the attribute you'd like to increase:\nStr\nDex\nCon\nInt\nWis\nCha");
        raceStatMod = input.nextLine();

        switch (raceStatMod.toUpperCase()){
            case("STR") -> player.attributeMods.Strength += 2;
            case("DEX") -> player.attributeMods.Dexterity += 2;
            case("CON") -> player.attributeMods.Constitution += 2;
            case("INT") -> player.attributeMods.Intelligence += 2;
            case("WIS") -> player.attributeMods.Wisdom += 2;
            case("CHA") -> player.attributeMods.Charisma += 2;
            default -> {
                System.out.println("Invalid attribute selected");
                registerPlayerStatMod();
            }
        }
    }

    public void registerPlayerClass(){
        SkillsTemp skills = new SkillsTemp();

        System.out.println("Please choose your character's class:\nBarbarian\nBard\nCleric\nDruid\nFighter\nMonk\nPaladin\nRanger\nRogue\nSorcerer\nWizard");
        String pClass = input.nextLine();
        switch (pClass.toUpperCase()){
            case("BARBARIAN") -> {
                player.info.pClass = Class.BARBARIAN;
                player.info.skills = skills.barbarianSkills;
                player.info.maxHealth = 1 + dice.Roll(12) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,3) * 10;
            }
            case("BARD") -> {
                player.info.pClass = Class.BARD;
                player.info.skills = skills.bardSkills;
                player.info.maxHealth = 1 + dice.Roll(8) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,3) * 10;
            }
            case("CLERIC") -> {
                player.info.pClass = Class.CLERIC;
                player.info.skills = skills.clericSkills;
                player.info.maxHealth = 1 + dice.Roll(8) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,4) * 10;
            }
            case("DRUID") -> {
                player.info.pClass = Class.DRUID;
                player.info.skills = skills.druidSkills;
                player.info.maxHealth = 1 + dice.Roll(8) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            case("FIGHTER") -> {
                player.info.pClass = Class.FIGHTER;
                player.info.skills = skills.fighterSkills;
                player.info.maxHealth = 1 + dice.Roll(10) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("MONK") -> {
                player.info.pClass = Class.MONK;
                player.info.skills = skills.monkSkills;
                player.info.maxHealth = 1 + dice.Roll(8) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6) * 10;
            }
            case("PALADIN") -> {
                player.info.pClass = Class.PALADIN;
                player.info.skills = skills.paladinSkills;
                player.info.maxHealth = 1 + dice.Roll(10) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("RANGER") -> {
                player.info.pClass = Class.RANGER;
                player.info.skills = skills.rangerSkills;
                player.info.maxHealth = 1 + dice.Roll(10) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,5) * 10;
            }
            case("ROGUE") -> {
                player.info.pClass = Class.ROGUE;
                player.info.skills = skills.rogueSkills;
                player.info.maxHealth = 1 + dice.Roll(8) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,4) * 10;
            }
            case("SORCERER") -> {
                player.info.pClass = Class.SORCERER;
                player.info.skills = skills.sorcererSkills;
                player.info.maxHealth = 1 + dice.Roll(6) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            case("WIZARD") -> {
                player.info.pClass = Class.WIZARD;
                player.info.skills = skills.wizardSkills;
                player.info.maxHealth = 1 + dice.Roll(6) + player.attributeMods.Constitution;
                player.wallet.GoldPieces = dice.Roll(6,2) * 10;
            }
            default ->{
                System.out.println("Invalid class.");
                registerPlayerClass();
            }
        }
        cmdMgr.cls();

        player.info.health = player.info.maxHealth;
    }

    //endregion

    //region Data Updates

    public void calculatePlayerAge(){
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

    public void updatePlayerValues(God.Creation.Player.Player player){
        this.player = player;
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