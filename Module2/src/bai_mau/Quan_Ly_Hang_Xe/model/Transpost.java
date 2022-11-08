package bai_mau.Quan_Ly_Hang_Xe.model;

import java.time.LocalDate;

public class Transpost {
    private String seaOfControl;
    private String manufacturer;
    private String yearOfManufacture;
    private String owner;

    public Transpost() {
    }

    public Transpost(String seaOfControl, String manufacturer, String yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transpost{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
