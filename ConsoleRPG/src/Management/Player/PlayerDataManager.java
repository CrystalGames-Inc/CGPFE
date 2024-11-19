package Management.Player;

import Game.Mechanics.Dice;
import Game.Other.Quol;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skills;

import java.util.Scanner;

public class PlayerDataManager {

    static Scanner input = new Scanner(System.in);

    public static void registerPlayer(Player player){
        String raceStatMod;

        System.out.println("Please choose your character's name: ");
        player.Info.Name = input.nextLine();
        Quol.cls();

        System.out.println("Please choose your character's race:\nDwarf\nElf\nGnome\nHalfElf\nHalfOrc\nHalfling\nHuman");
        String race = input.nextLine();
        Quol.cls();

        switch (race.toUpperCase()){
            case("DWARF"):
                player.Info.Race = Race.DWARF;
                player.AttributeMods.Constitution += 2;
                player.AttributeMods.Wisdom += 2;
                player.AttributeMods.Charisma -= 2;
                player.Attributes.MoveSpeed = 20;
                break;

            case("ELF"):
                player.Info.Race = Race.ELF;
                player.AttributeMods.Dexterity += 2;
                player.AttributeMods.Constitution -= 2;
                player.AttributeMods.Intelligence += 2;
                player.Attributes.MoveSpeed = 30;
                break;

            case("GNOME"):
                player.Info.Race = Race.GNOME;
                player.AttributeMods.Strength -= 2;
                player.AttributeMods.Constitution += 2;
                player.AttributeMods.Charisma += 2;
                player.Attributes.MoveSpeed = 20;
                break;

            case("HALFELF"):
                System.out.println("Please select the attribute you'd like to increase:\nStr\nDex\nCon\nInt\nWis\nCha");
                raceStatMod = input.nextLine();

                switch (raceStatMod){
                    case("STR"):
                        player.AttributeMods.Strength += 2;
                        break;
                    case("DEX"):
                        player.AttributeMods.Dexterity += 2;
                        break;
                    case("CON"):
                        player.AttributeMods.Constitution += 2;
                        break;
                    case("INT"):
                        player.AttributeMods.Intelligence += 2;
                        break;
                    case("WIS"):
                        player.AttributeMods.Wisdom += 2;
                        break;
                    case("CHA"):
                        player.AttributeMods.Charisma += 2;
                        break;
                }

                player.Info.Race = Race.HALFELF;
                player.Attributes.MoveSpeed = 30;
                break;

            case("HALFORC"):
                System.out.println("Please select the attribute you'd like to increase:\nStr\nDex\nCon\nInt\nWis\nCha");
                raceStatMod = input.nextLine();

                switch (raceStatMod){
                    case("STR"):
                        player.AttributeMods.Strength += 2;
                        break;
                    case("DEX"):
                        player.AttributeMods.Dexterity += 2;
                        break;
                    case("CON"):
                        player.AttributeMods.Constitution += 2;
                        break;
                    case("INT"):
                        player.AttributeMods.Intelligence += 2;
                        break;
                    case("WIS"):
                        player.AttributeMods.Wisdom += 2;
                        break;
                    case("CHA"):
                        player.AttributeMods.Charisma += 2;
                        break;
                }

                player.Info.Race = Race.HALFORC;
                player.Attributes.MoveSpeed = 30;
                break;

            case("HALFLING"):
                player.Info.Race = Race.HALFLING;
                player.AttributeMods.Strength -= 2;
                player.AttributeMods.Dexterity += 2;
                player.AttributeMods.Charisma += 2;
                player.Attributes.MoveSpeed = 20;
                break;

            case("HUMAN"):
                System.out.println("Please select the attribute you'd like to increase:\nStr\nDex\nCon\nInt\nWis\nCha");
                raceStatMod = input.nextLine();

                switch (raceStatMod){
                    case("STR"):
                        player.AttributeMods.Strength += 2;
                        break;
                    case("DEX"):
                        player.AttributeMods.Dexterity += 2;
                        break;
                    case("CON"):
                        player.AttributeMods.Constitution += 2;
                        break;
                    case("INT"):
                        player.AttributeMods.Intelligence += 2;
                        break;
                    case("WIS"):
                        player.AttributeMods.Wisdom += 2;
                        break;
                    case("CHA"):
                        player.AttributeMods.Charisma += 2;
                        break;
                }

                player.Info.Race = Race.HUMAN;
                player.Attributes.MoveSpeed = 30;
                break;
        }
        Quol.cls();

        System.out.println("Please choose your character's class:\nBarbarian\nBard\nCleric\nDruid\nFighter\nMonk\nPaladin\nRanger\nRogue\nSorcerer\nWizard");
        String pClass = input.nextLine();
        switch (pClass.toUpperCase()){
            case("BARBARIAN"):
                player.Info.Class = Class.BARBARIAN;
                player.Info.Skills = Skills.barbarianSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(12) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,3) * 10;
                break;
            case("BARD"):
                player.Info.Class = Class.BARD;
                player.Info.Skills = Skills.bardSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(8) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,3) * 10;
                break;
            case("CLERIC"):
                player.Info.Class = Class.CLERIC;
                player.Info.Skills = Skills.clericSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(8) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,4) * 10;
                break;
            case("DRUID"):
                player.Info.Class = Class.DRUID;
                player.Info.Skills = Skills.druidSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(8) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,2) * 10;
                break;
            case("FIGHTER"):
                player.Info.Class = Class.FIGHTER;
                player.Info.Skills = Skills.fighterSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(10) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,5) * 10;
                break;
            case("MONK"):
                player.Info.Class = Class.MONK;
                player.Info.Skills = Skills.monkSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(8) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6) * 10;
                break;
            case("PALADIN"):
                player.Info.Class = Class.PALADIN;
                player.Info.Skills = Skills.paladinSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(10) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,5) * 10;
                break;
            case("RANGER"):
                player.Info.Class = Class.RANGER;
                player.Info.Skills = Skills.rangerSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(10) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,5) * 10;
                break;
            case("ROGUE"):
                player.Info.Class = Class.ROGUE;
                player.Info.Skills = Skills.rogueSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(8) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,4) * 10;
                break;
            case("SORCERER"):
                player.Info.Class = Class.SORCERER;
                player.Info.Skills = Skills.sorcererSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(6) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,2) * 10;
                break;
            case("WIZARD"):
                player.Info.Class = Class.WIZARD;
                player.Info.Skills = Skills.wizardSkills;
                player.Info.MaxHealth = 1 + Dice.Roll(6) + player.AttributeMods.Constitution;
                player.Wallet.GoldPieces = Dice.Roll(6,2) * 10;
                break;
        }
        Quol.cls();

        player.Info.Health = player.Info.MaxHealth;
    }

    public static void displayPlayerData(Player player){
        System.out.println("|Player Info:");
        System.out.println("|Name      : " + player.Info.Name);
        System.out.println("|Race      : " + player.Info.Race);
        System.out.println("|Class     : " + player.Info.Class);
        System.out.println("|Level     : " + player.Info.Level);
        System.out.println("|XP        : " + player.Info.XP);
        System.out.println("|Health    : " + player.Info.Health);
        System.out.println("|Max Health: " + player.Info.MaxHealth);
        System.out.println("\n|Skills: ");
        for(int i = 0; i < player.Info.Skills.length; i++)
            System.out.println("|    " + player.Info.Skills[i].Name);
        System.out.println("\n|Attributes:");
        System.out.println("|   Strength    : " + player.Attributes.Strength);
        System.out.println("|   Dexterity   : " + player.Attributes.Dexterity);
        System.out.println("|   Constitution: " + player.Attributes.Constitution);
        System.out.println("|   Intelligence: " + player.Attributes.Intelligence);
        System.out.println("|   Wisdom      : " + player.Attributes.Wisdom);
        System.out.println("|   Charisma    : " + player.Attributes.Strength);
        System.out.println("|   Move Speed  : " + player.Attributes.MoveSpeed);

        System.out.println("\n|Attribute Modifiers:");
        System.out.println("|   Strength    : " + player.AttributeMods.Strength);
        System.out.println("|   Dexterity   : " + player.AttributeMods.Dexterity);
        System.out.println("|   Constitution: " + player.AttributeMods.Constitution);
        System.out.println("|   Intelligence: " + player.AttributeMods.Intelligence);
        System.out.println("|   Wisdom      : " + player.AttributeMods.Wisdom);
        System.out.println("|   Charisma    : " + player.AttributeMods.Strength);
        System.out.println("|   Move Speed  : " + player.AttributeMods.MoveSpeed);

        System.out.println("\n|Wallet:");
        System.out.println("|   Copper Pieces  : " + player.Wallet.CopperPieces);
        System.out.println("|   Silver Pieces  : " + player.Wallet.SilverPieces);
        System.out.println("|   Gold Pieces    : " + player.Wallet.GoldPieces);
        System.out.println("|   Platinum Pieces: " + player.Wallet.PlatinumPieces);

    }
}