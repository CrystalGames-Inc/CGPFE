package CGPFE.Mechanics.Player;

import CGPFE.Data.Models.Items.Item;

public class InventoryItem extends Item {
     public String name;
     public int itemId;
     public int inventoryId;
     public int amount;
     public int maxCapacity;

     public InventoryItem(String name, int itemId, int inventoryId, int amount, int maxCapacity){
         super(name, itemId, 0);
          this.name = name;
          this.itemId = itemId;
          this.inventoryId = inventoryId;
          this.amount = amount;
          this.maxCapacity = maxCapacity;
     }
}
