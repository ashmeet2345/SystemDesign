package VendingMaching;

import java.util.List;

public class HasMoney implements State{
    @Override
    public void cliclOnInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine maching, int code) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return List.of();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {

    }
}
