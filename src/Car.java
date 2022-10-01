import java.util.Arrays;

public class Car {
    private String brand;
    private String model;
    private float volumeEngine;
    private String color;
    private int manufactureYear;
    private String country;


    public Car(String brand, String model,int manufactureYear,  String country, String color, float volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.country = country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolumeEngine(float volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    public String getColor() {
        return color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getCountry() {
        return country;
    }
}
