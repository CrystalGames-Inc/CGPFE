package Engine.Display;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.Game.Mechanics.Player.InventoryItem;
import Engine.God.Creation.Entity.Additional.EntityWallet;
import Engine.God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import Engine.God.Creation.Entity.Mandatory.EntityAttributes;
import Engine.God.Creation.Importance.Constants.Alignment;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Gender;
import Engine.God.Creation.Importance.Constants.Race;
import Engine.God.Creation.Player.Player;
import Engine.God.Creation.Player.PlayerInfo;

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