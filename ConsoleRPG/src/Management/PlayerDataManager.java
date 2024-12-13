package Management;

import Game.Data.Models.Item;
import Game.Mechanics.Dice;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skill;
import God.Creation.Importance.Skills.Skills;
import God.Creation.Player.Player;
import God.Creation.Player.PlayerInfo;

import java.util.Scanner;

public class PlayerDataManager {

    public CommandManagerSingleton cmdMgr = CommandManagerSingleton.getInstance();

    public Scanner input = new Scanner(System.in);

    public Player Player = new Player(new PlayerInfo("PLACEHOLDER", Race.PLACEHOLDER, Class.PLACEHOLDER, 0,0,0,0, new Skill[]{}), new EntityAttributes(0,0,0,0,0,0,0), new EntityAttributeModifiers(0,0,0,0,0,0,0), new EntityWallet(0,0,0,0), new Item[210]);


    public void registerNewPlayer(Player player){
        registerPlayerInfo();
        player = Player;
    }

    public void updatePlayerValues(Player player){
        Player = player;
    }

    public void registerPlayerInfo(){
        System.out.println("Please choose your character's name: ");
        Player.Info.Name = input.nextLine();
        cmdMgr.cls();

        registerPlayerRace();

        registerPlayerClass();
    }

    public void registerPlayerRace(){


        System.out.println("Please choose your character's race:\nDwarf\nElf\nGnome\nHalfElf\nHalfOrc\nHalfling\nHuman");
        String race = input.nextLine();
        cmdMgr.cls();

        switch (race.toUpperCase()){
            case("DWARF"):
                Player.Info.Race = Race.DWARF;
                Player.AttributeMods.Constitution += 2;
                Player.AttributeMods.Wisdom += 2;
                Player.AttributeMods.Charisma -= 2;
                Player.Attributes.MoveSpeed = 20;
                break;

            case("ELF"):
                Player.Info.Race = Race.ELF;
                Player.AttributeMods.Dexterity += 2;
                Player.AttributeMods.Constitution -= 2;
                Player.AttributeMods.Intelligence += 2;
                Player.Attributes.MoveSpeed = 30;
                break;

            case("GNOME"):
                Player.Info.Race = Race.GNOME;
                Player.AttributeMods.Strength -= 2;
                Player.AttributeMods.Constitution += 2;
                Player.AttributeMods.Charisma += 2;
                Player.Attributes.MoveSpeed = 20;
                break;

            case("HALFELF"):
                registerPlayerStatMod();

                Player.Info.Race = Race.HALFELF;
                Player.Attributes.MoveSpeed = 30;
                break;

            case("HALFORC"):
                registerPlayerStatMod();

                Player.Info.Race = Race.HALFORC;
                Player.Attributes.MoveSpeed = 30;
                break;

            case("HALFLING"):
                Player.Info.Race = Race.HALFLING;
                Player.AttributeMods.Strength -= 2;
                Player.AttributeMods.Dexterity += 2;
                Player.AttributeMods.Charisma += 2;
                Player.Attributes.MoveSpeed = 20;
                break;

            case("HUMAN"):
                registerPlayerStatMod();

                Player.Info.Race = Race.HUMAN;
                Player.Attributes.MoveSpeed = 30;
                break;

            default:
                System.out.println("Invalid Race.");
                registerPlayerRace();
                break;
        }
        cmdMgr.cls();
    }

    public void registerPlayerStatMod(){
        String raceStatMod;

        System.out.println("Please select the attribute you'd like to increase:\nStr\nDex\nCon\nInt\nWis\nCha");
        raceStatMod = input.nextLine();

        switch (raceStatMod.toUpperCase()){
            case("STR"):
                Player.AttributeMods.Strength += 2;
                break;
            case("DEX"):
                Player.AttributeMods.Dexterity += 2;
                break;
            case("CON"):
                Player.AttributeMods.Constitution += 2;
                break;
            case("INT"):
                Player.AttributeMods.Intelligence += 2;
                break;
            case("WIS"):
                Player.AttributeMods.Wisdom += 2;
                break;
            case("CHA"):
                Player.AttributeMods.Charisma += 2;
                break;
            default:
                System.out.println("Invalid attribute selected");
                registerPlayerStatMod();
                break;
        }
    }

    public void registerPlayerClass(){

        CommandManagerSingleton cmdMgr = CommandManagerSingleton.getInstance();
        Dice dice = new Dice();
        Skills skills = new Skills();

        System.out.println("Please choose your character's class:\nBarbarian\nBard\nCleric\nDruid\nFighter\nMonk\nPaladin\nRanger\nRogue\nSorcerer\nWizard");
        String pClass = input.nextLine();
        switch (pClass.toUpperCase()){
            case("BARBARIAN"):
                Player.Info.Class = Class.BARBARIAN;
                Player.Info.Skills = skills.barbarianSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(12) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,3) * 10;
                break;
            case("BARD"):
                Player.Info.Class = Class.BARD;
                Player.Info.Skills = skills.bardSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(8) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,3) * 10;
                break;
            case("CLERIC"):
                Player.Info.Class = Class.CLERIC;
                Player.Info.Skills = skills.clericSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(8) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,4) * 10;
                break;
            case("DRUID"):
                Player.Info.Class = Class.DRUID;
                Player.Info.Skills = skills.druidSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(8) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,2) * 10;
                break;
            case("FIGHTER"):
                Player.Info.Class = Class.FIGHTER;
                Player.Info.Skills = skills.fighterSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(10) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,5) * 10;
                break;
            case("MONK"):
                Player.Info.Class = Class.MONK;
                Player.Info.Skills = skills.monkSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(8) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6) * 10;
                break;
            case("PALADIN"):
                Player.Info.Class = Class.PALADIN;
                Player.Info.Skills = skills.paladinSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(10) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,5) * 10;
                break;
            case("RANGER"):
                Player.Info.Class = Class.RANGER;
                Player.Info.Skills = skills.rangerSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(10) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,5) * 10;
                break;
            case("ROGUE"):
                Player.Info.Class = Class.ROGUE;
                Player.Info.Skills = skills.rogueSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(8) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,4) * 10;
                break;
            case("SORCERER"):
                Player.Info.Class = Class.SORCERER;
                Player.Info.Skills = skills.sorcererSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(6) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,2) * 10;
                break;
            case("WIZARD"):
                Player.Info.Class = Class.WIZARD;
                Player.Info.Skills = skills.wizardSkills;
                Player.Info.MaxHealth = 1 + dice.Roll(6) + Player.AttributeMods.Constitution;
                Player.Wallet.GoldPieces = dice.Roll(6,2) * 10;
                break;
            default:
                System.out.println("Invalid class.");
                registerPlayerClass();
                break;
        }
        cmdMgr.cls();

        Player.Info.Health = Player.Info.MaxHealth;
    }

    public void displayPlayerData(){
        System.out.println("|Player Info:");
        System.out.println("|Name      : " + Player.Info.Name);
        System.out.println("|Race      : " + Player.Info.Race);
        System.out.println("|Class     : " + Player.Info.Class);
        System.out.println("|Level     : " + Player.Info.Level);
        System.out.println("|XP        : " + Player.Info.XP);
        System.out.println("|Health    : " + Player.Info.Health);
        System.out.println("|Max Health: " + Player.Info.MaxHealth);
        System.out.println("\n|Skills: ");
        for(int i = 0; i < Player.Info.Skills.length; i++)
            System.out.println("|    " + Player.Info.Skills[i].Name);
        System.out.println("\n|Attributes:");
        System.out.println("|   Strength    : " + Player.Attributes.Strength);
        System.out.println("|   Dexterity   : " + Player.Attributes.Dexterity);
        System.out.println("|   Constitution: " + Player.Attributes.Constitution);
        System.out.println("|   Intelligence: " + Player.Attributes.Intelligence);
        System.out.println("|   Wisdom      : " + Player.Attributes.Wisdom);
        System.out.println("|   Charisma    : " + Player.Attributes.Strength);
        System.out.println("|   Move Speed  : " + Player.Attributes.MoveSpeed);

        System.out.println("\n|Attribute Modifiers:");
        System.out.println("|   Strength    : " + Player.AttributeMods.Strength);
        System.out.println("|   Dexterity   : " + Player.AttributeMods.Dexterity);
        System.out.println("|   Constitution: " + Player.AttributeMods.Constitution);
        System.out.println("|   Intelligence: " + Player.AttributeMods.Intelligence);
        System.out.println("|   Wisdom      : " + Player.AttributeMods.Wisdom);
        System.out.println("|   Charisma    : " + Player.AttributeMods.Strength);
        System.out.println("|   Move Speed  : " + Player.AttributeMods.MoveSpeed);

        System.out.println("\n|Wallet:");
        System.out.println("|   Copper Pieces  : " + Player.Wallet.CopperPieces);
        System.out.println("|   Silver Pieces  : " + Player.Wallet.SilverPieces);
        System.out.println("|   Gold Pieces    : " + Player.Wallet.GoldPieces);
        System.out.println("|   Platinum Pieces: " + Player.Wallet.PlatinumPieces);

    }
}