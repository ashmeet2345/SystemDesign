package CarRentalSystem.Product;

import java.util.Date;

public class Vehicle {
    int id;
    int vehicleNumber;
    VehicleType type;
    Date manufacturingDate;
    int cc;
    float average;
    int kmDriven;

    public float getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(float dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public float getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(float hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    VehicleStatus status;
    float dailyRentalCost;
    float hourlyRentalCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
