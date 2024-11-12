package Game.Data.Models;

public class Item {
    public int InventoryId;
    public int Amount;
    public int MaxCapacity;

    public Item(int inventoryId, int amount, int maxCapacity){
        InventoryId = inventoryId;
        Amount = amount;
        MaxCapacity = maxCapacity;
    }
}
