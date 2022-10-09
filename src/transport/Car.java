package transport;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    private int manufactureYear;
    private String country;
    private String color;
    private float volumeEngine;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int seat;
    private boolean winterTire;

    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }

    public boolean isWinterTire() {
        return winterTire;
    }

    private Car[] cars;

    public Car(){

        this ("default", "default", 2000, "default", "белый", 1.5f, null, null,null,0,false);
    }

    public Car(String brand, String model, int manufactureYear,  String country, String color,
               float volumeEngine, String transmission, String bodyType, String registrationNumber,
                int seat, boolean winterTire) {

        this.winterTire = winterTire;

        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if (seat < 0) {
            this.seat = 0;
        }else {
            this.seat = seat;
        }



        if (bodyType == null) {
            this.bodyType = "default";
        }else {
            this.bodyType = bodyType;
        }

        if (transmission == null) {
            this.transmission = "default";
        }else{
            this.transmission = transmission;
        }


        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (manufactureYear <= 0) {
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

        if (registrationNumber == null) {
            this.registrationNumber = "default";
        }else {
            checkRegistrationNumber(registrationNumber);
            this.registrationNumber = registrationNumber;
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

    public void setVolumeEngine(float volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }



    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeat() {
        return seat;
    }

    public void checkTire(Car[] cars) {
        int[] month = {10,11,12,1,2,3}; //зимняя резина
        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < cars.length; i++) {
            for (int monthNumber : month) {
                if (monthNumber == localDate.getMonthValue() && cars[i].isWinterTire()==false) {
                    System.out.println("на машине " + cars[i].getBrand() + " нужно заменить резину на зимнюю");
                }
            }
            if (localDate.getMonthValue() >=4 && localDate.getMonthValue() <= 9 && cars[i].isWinterTire()==true) {
                System.out.println("на машине " + cars[i].getBrand() + " нужно заменить резину на летнюю");
            }

        }

    }

    private void checkRegistrationNumber (String registrationNumber) {
        int x;
        if (registrationNumber.length()==8){
            x=2;
        }else {
            x=3;
        }
        final String regex = "[АВЕКМНОРСТУХABCEHKMOPTX][0-9]{3}[АВЕКМНОРСТУХABCEHKMOPTX]{2}[0-9]{"+ x +"}\\z";
        final String string = registrationNumber;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.UNICODE_CASE | Pattern.COMMENTS);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));
            }
        }else{
            System.out.println("Номер автомобиля " + this.getBrand() + " не соответствует");
            System.exit(1);
        }

    }

}
