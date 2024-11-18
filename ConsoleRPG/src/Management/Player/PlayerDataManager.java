package Management.Player;

import God.Creation.Importance.Race;

import java.util.Scanner;

public class PlayerDataManager {

    static Scanner input;

    public static void RegisterPlayer(Player player){
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
        }
    }
}
