package CarRentalSystem;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    float amount;

    Bill(Reservation reservation){
        this.reservation=reservation;
        this.amount=computeAmount();
        this.isPaid=false;
    }

    private float computeAmount() {
        return 100.0F;
    }
}
