package VendingMaching;

import java.util.List;

public interface State {

    void cliclOnInsertCoinButton(VendingMachine machine) throws Exception;
    void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    void chooseProduct(VendingMachine machine, int code) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    Item dispenseProduct(VendingMachine maching, int code) throws Exception;
    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    void updateInventory(VendingMachine machine, Item item, int code) throws Exception;
}
