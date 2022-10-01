import java.util.Arrays;

public class Car {
    private String brand;
    private String model;
    private float volumeEngine;
    private String color;
    private int manufactureYear;
    private String country;

    private Car[] cars;

    public Car (){
        cars = new Car[0];
    }


    public Car(String brand, String model,int manufactureYear,  String country, String color, float volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.country = country;
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
