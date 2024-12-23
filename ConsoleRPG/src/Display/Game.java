package Display;

import Game.Mechanics.Player.InventoryItem;
import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Importance.Constants.Alignment;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Gender;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skill;
import God.Creation.Player.Player;
import God.Creation.Player.PlayerInfo;

public class Game {

    public Player player = new Player(
            new PlayerInfo("PLACEHOLDER", Gender.MALE, Alignment.NEUTRAL, 12, Race.PLACEHOLDER, Class.PLACEHOLDER, 0,0,0,0,new Skill[]{}),
            new EntityAttributes(0,0,0,0,0,0,0),
            new EntityAttributeModifiers(0,0,0,0,0,0,0),
            new EntityWallet(0,0,0,0),
            new InventoryItem[210]
    );

    public static void main(String[] args){
        GameStartup g = new GameStartup();

        g.startGame();
    }
}