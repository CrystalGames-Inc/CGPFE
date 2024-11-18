package Management.Player;

import God.Creation.Importance.Race;

import java.util.Scanner;

public class PlayerDataManager {

    static Scanner input;

    public static void RegisterPlayer(Player player){
        String raceStatMod;

        System.out.println("Please choose your character's name: ");
        String name = input.nextLine();

        System.out.println("Please choose your character's race:\nDwarf\nElf\nGnome\nHalfElf\nHalfOrc\nHalfling\nHuman");
        String race = input.nextLine();

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
    }
}
