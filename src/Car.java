import java.util.Arrays;

public class Car {
    private String brand;
    private String model;
    private float volumeEngine;
    private String color;
    private int manufactureYear;
    private String country;

    private Car[] cars;

    public Car(){

        this ("default", "default", 2000, "default", "белый", 1.5f);
    }

    public Car(String brand, String model, int manufactureYear,  String country, String color, float volumeEngine) {
        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (manufactureYear == 0) {
            this.manufactureYear = 2000;
        } else {
            this.manufactureYear = manufactureYear;
        }
        if (country == null) {
            this.country = "default";
        }else {
            this.country = country;
        }
        if (color == null) {
            this.color = "белый";
        }else {
            this.color = color;
        }
        if (volumeEngine == 0.0f) {
            this.volumeEngine = 1.5f;
        }else {
            this.volumeEngine = volumeEngine;
        }
        cars = new Car[0];
    }


    public Car[] getCars() {
        if (cars == null){
            cars = new Car[0];
        }
        return cars;
    }
    public void addCars (Car car){
     this.cars = Arrays.copyOf(getCars(),  getCars().length+1);
     this.cars[this.cars.length-1] = car;
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
