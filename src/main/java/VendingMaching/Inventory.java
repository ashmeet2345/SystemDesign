package VendingMaching;

public class Inventory {
    ItemShelf[] inventory;

    Inventory(int itemCount, ItemShelf[] inventory){
        inventory=new ItemShelf[itemCount];
        initializeEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    private void initializeEmptyInventory(){
        int start=101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf obj=new ItemShelf();
            obj.setCode(start);
            obj.setSoldOut(true);
            inventory[i]=obj;
            start++;
        }
    }

    public void addItemToInventory(Item item, int codeNumber) throws Exception {
        for(ItemShelf shelf: inventory){
            if(shelf.getCode()==codeNumber){
               if(shelf.isSoldOut){
                   shelf.setItem(item);
                   shelf.setSoldOut(false);
               } else {
                   throw new Exception("Item already present, cannot add more items");
               }
            }
        }
    }

}
