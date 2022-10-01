import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /*
        Максим из города Минск, которому 35 лет
        Аня из города Москва, которой 29 лет
        Катя из города Калининград, которой 28 лет
        Артем из города Москва, которому 27 лет
        * */
        //task1_2();
        task3();


    }

    public static void task1_2 (){
        LocalDate localDate = LocalDate.now();
        LocalDate birthDayMax = LocalDate.of(1987, 4, 12);
        int age = localDate.getYear() - birthDayMax.getYear();
        Human humanMax = new Human("Максим", age, "Минск", "бренд-менеджером");
        System.out.println(humanMax.getName() + " из города " + humanMax.getCurrentCity() + ", которому " +humanMax.getBirthDate() + " лет");

        LocalDate birthDayAnya = LocalDate.of(1993, 4, 12);
        age = localDate.getYear() - birthDayAnya.getYear();
        Human humanAnya = new Human("Аня", age, "Москва", "методистом образовательных программ");
        System.out.println(humanAnya.getName() + " из города " + humanAnya.getCurrentCity() + ", которой " +humanAnya.getBirthDate() + " лет");

        LocalDate birthDayKatya = LocalDate.of(1994, 4, 12);
        age = localDate.getYear() - birthDayKatya.getYear();
        Human humanKatya = new Human("Катя", age, "Калининград", "продакт-менеджером");
        System.out.println(humanKatya.getName() + " из города " + humanKatya.getCurrentCity() + ", которой " +humanKatya.getBirthDate() + " лет");

        LocalDate birthDayArtem = LocalDate.of(1995, 4, 12);
        age = localDate.getYear() - birthDayArtem.getYear();
        Human humanArtem = new Human("Артем", age, "Москва", "директором по развитию бизнеса" );
        System.out.println(humanArtem.getName() + " из города " + humanArtem.getCurrentCity() + ", которому " +humanArtem.getBirthDate() + " лет");

        System.out.println("Привет! Меня зовут "+humanMax.getName()+
                "\nЯ из города " +humanMax.getCurrentCity() +
                "\nЯ родился в "+ birthDayMax.getYear()+" году. " +
                "\nЯ работаю на должности "+humanMax.getPosition()+" Будем знакомы!\n");
        System.out.println("Привет! Меня зовут "+humanAnya.getName()+
                "\nЯ из города " +humanAnya.getCurrentCity() +
                "\nЯ родился в "+ birthDayAnya.getYear()+" году. " +
                "\nЯ работаю на должности "+humanAnya.getPosition()+" Будем знакомы!\n");
        System.out.println("Привет! Меня зовут "+humanKatya.getName()+
                "\nЯ из города " +humanKatya.getCurrentCity() +
                "\nЯ родился в "+ birthDayKatya.getYear()+" году. " +
                "\nЯ работаю на должности "+humanKatya.getPosition()+" Будем знакомы!\n");
        System.out.println("Привет! Меня зовут "+humanArtem.getName()+
                "\nЯ из города " +humanArtem.getCurrentCity() +
                "\nЯ родился в "+ birthDayArtem.getYear()+" году. " +
                "\nЯ работаю на должности "+humanArtem.getPosition()+" Будем знакомы!\n");
    }
    public static void task3 (){
        /*
        Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
        BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
        Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
        Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
        * */

        Car cars = new Car();
        Car lada = new Car("Lada", "Grande", 2015, "Россия", "Желтый", 1.7f);
        cars.addCars(lada);
        Car audi = new Car("Audi", "A8", 2020, "Германия", "черный", 3.0f);
        cars.addCars(audi);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f);
        cars.addCars(bmw);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4f);
        cars.addCars(kia);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);
        cars.addCars(hyundai);

        for (int i = 0; i < cars.getCars().length; i++) {
            printCarInfo(cars.getCars()[i]);
        }
    }

    private static void printCarInfo(Car car) {
        System.out.println(car.getBrand()+ ", " + car.getModel()+ ", год выпуска, " + car.getManufactureYear() + ", сборка в  " + car.getCountry() + ", цвет " + car.getColor() + ", объем двигателя " + car.getVolumeEngine() +" литра");
    }


}