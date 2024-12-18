package VendingMaching;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    IdleState(){
        System.out.println("Currently Vending machine is in Idle State. ");
    }

    IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in Idle State. ");
        machine.setCoins(new ArrayList<>());
    }

    @Override
    public void cliclOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setState(new HasMoney());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine maching, int code) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {
        machine.getInventory().addItemToInventory(item,code);
    }
}
