package VendingMaching;

public enum Coin {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    int value;
    Coin(int value) {
        this.value=value;
    }
}
