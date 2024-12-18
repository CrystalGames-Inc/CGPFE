package Game.Data.Storage.World;

import Game.Data.Models.ItemTypes.Goods.Good;

public class Goods {
    public Good backpack = new Good("Backpack",0,0,0,2,2);
    public Good barrel = new Good("Barrel",1,0,0,2,30);
    public Good basket = new Good("Basket",2,0,0,2,1);
    public Good bedroll = new Good("Bedroll",3,0,0,0.1,5);
    public Good bell = new Good("Bell",4,0,0,1, 0);
    public Good winterBlanket = new Good("Winter Blanket",5,0,0,0.5,3);
    public Good blockAndTackle = new Good("Block And Tackle",6,0,0,5,5);
    public Good glassBottle = new Good("Glass Bottle",7,0,0,2,1);
}
