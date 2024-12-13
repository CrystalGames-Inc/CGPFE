package Display;

import Game.Data.Models.Item;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skill;
import Management.CommandManagerSingleton;
import God.Creation.Player.Player;
import God.Creation.Player.PlayerInfo;

import java.util.Scanner;

public class Game {

    public Scanner input = new Scanner(System.in);

    public static Player player = new Player(new PlayerInfo("PLACEHOLDER", Race.PLACEHOLDER, Class.PLACEHOLDER, 0,0,0,0, new Skill[]{}), new EntityAttributes(0,0,0,0,0,0,0), new EntityAttributeModifiers(0,0,0,0,0,0,0), new EntityWallet(0,0,0,0), new Item[210]);

    public static void main(String[] args){
        GameStartup g = new GameStartup();

        g.startGame();
    }


}