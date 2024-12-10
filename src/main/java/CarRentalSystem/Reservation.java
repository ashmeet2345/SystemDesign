package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date bookedFrom;
    Date bookedTo;
    Location pickUpLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;

    public int createReservation(User user, Vehicle vehicle){
        this.user=user;
        this.vehicle=vehicle;
        this.bookingDate=new Date();
        reservationId=111223;
        reservationStatus=ReservationStatus.SCHEDULED;

        return reservationId;
    }

}
