package SpiritEngine.Game.Data.Models.Items;

public class Currency {
     public String Name;
     public double CopperValue;
     public double SilverValue;
     public double GoldValue;
     public double PlatinumValue;

     public Currency(String name, double copperValue, double silverValue, double goldValue, double platinumValue){
          Name = name;
          CopperValue = copperValue;
          SilverValue = silverValue;
          GoldValue = goldValue;
          PlatinumValue = platinumValue;
     }
}
