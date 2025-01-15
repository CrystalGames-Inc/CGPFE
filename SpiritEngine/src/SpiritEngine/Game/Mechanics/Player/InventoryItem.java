package SpiritEngine.Game.Mechanics.Player;

public class InventoryItem{
     public String name;
     public int itemId;
     public int inventoryId;
     public int amount;
     public int maxCapacity;

     public InventoryItem(String name, int itemId, int inventoryId, int amount, int maxCapacity){
          this.name = name;
          this.itemId = itemId;
          this.inventoryId = inventoryId;
          this.amount = amount;
          this.maxCapacity = maxCapacity;
     }
}
