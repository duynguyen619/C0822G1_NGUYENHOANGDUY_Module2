package bai_mau.Quan_Ly_Hang_Xe.model;

public class Car extends Transpost {
    private int numberOfSeat;
    private String vehicletype;

    public Car(int numberOfSeat, String vehicletype) {
        this.numberOfSeat = numberOfSeat;
        this.vehicletype = vehicletype;
    }

    public Car(String seaOfControl, String manufacturer, String yearOfManufacture, String owner, String vehicletype) {
        super(seaOfControl, manufacturer, yearOfManufacture, owner);
        this.vehicletype = vehicletype;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeat=" + numberOfSeat +
                ", vehicletype='" + vehicletype + '\'' +
                '}';
    }
    public String getInfo() {
        return String.format("%s,%s,%s", super.toString(), numberOfSeat, vehicletype);
    }
}
