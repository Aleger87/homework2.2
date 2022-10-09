import transport.Car;

import java.time.LocalDate;
import java.util.Scanner;


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
        //task4();


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

        Human man = new Human();

        Human artem = new Human("Артем", -21, "Москва", "директором по развитию бизнеса" );
        System.out.println(artem.getBirthDate());
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
        Car.Key keyTrue = new Car.Key(true,true);
        Car.Key keyFalse = new Car.Key(false,false);
        Car.Key keyFalseTrue = new Car.Key(false,true);
        Car.Key keyTrueFalse = new Car.Key(true,false);

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "Желтый", 1.7f,
                null,null,"В100АP781",0,true, keyTrue);
        cars.addCars(lada);
        Car.Insurance ins =  lada.new Insurance(360,3000,"12345678F");
        lada.setInsurance(ins);
        System.out.println(lada.getInsurance().getNumberInsurance());

         Car audi = new Car("Audi", "A8", 2020,
                "Германия", "черный", 3.0f,null, null,null,0,false, keyFalseTrue);
        cars.addCars(audi);

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f,
                null, null,null,0,true, keyFalse);
        cars.addCars(bmw);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4f,
                null, null,null,0,false, keyTrueFalse);
        cars.addCars(kia);

        Car hyundai = new Car("Hyundai", null, 0, "Южная Корея", null, 1.6f,
                null, null,null,0,false, keyTrue);
        cars.addCars(hyundai);

        for (int i = 0; i < cars.getCars().length; i++) {
            printCarInfo(cars.getCars()[i]);
        }

        cars.checkTire(cars.getCars());


    }



    private static void printCarInfo(Car car) {

        System.out.println(car.getBrand()+ ", " +" номер "+ car.getRegistrationNumber()+ " " + car.getModel()+ ", год выпуска, " + car.getManufactureYear() + ", сборка в  " + car.getCountry() + ", цвет " + car.getColor() + ", объем двигателя " + car.getVolumeEngine() +" литра");
    }

    private static void task4() {
        Flower flowers = new Flower(null, null, 0);
        Flower rose = new Flower("Роза", "Голландия", 35.59f);
        flowers.addFlowers(rose);
        Flower chrysanthemum = new Flower("Хризантема", null, 15.5f);
        flowers.addFlowers(chrysanthemum);
        Flower pion = new Flower( "Пион", "Англия", 69.90f);
        flowers.addFlowers(pion);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5f);
        flowers.addFlowers(gypsophila);


        additionalTask(flowers.getFlowers());


    }

    private static void printFlowers(Flower flower) {
        System.out.println("артикул - " + flower.getId()+" "+flower.getName() +", страна происхождения — " + flower.getCountry()+", стоимость штуки — " + flower.getCost() + " рублей, срок стояния — "+flower.getLifeSpan() + " дней, цвет - "+flower.getFlowerColor());
    }

    private static void additionalTask(Flower[] flowers) {
        System.out.println("Давайте соберем букет, вот наш ассортимент:");
        for (int i = 0; i < flowers.length; i++) {
            printFlowers(flowers[i]);
        }
        System.out.println("Выберите артикул цветка и укажите количество через '-' затем ','(например 1-5,2-6,3-1)");
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        validData(s);

        float sum = 0f;
        int lifeSpan = 0;
        System.out.println("Ваш заказ:");

        for (int i = 0; i < s.length(); i=i+2) {
            for (int i1 = 0; i1 < flowers.length; i1++) {
                if (Integer.parseInt(String.valueOf(s.charAt(i))) == flowers[i1].getId()){

                    System.out.print(flowers[i1].getName()+" - "+s.charAt(i+1) + " шт., ");
                    sum = (float) (sum + (Integer.parseInt(String.valueOf(s.charAt(i+1))) * flowers[i1].getCost()));
                    if (lifeSpan < flowers[i1].getLifeSpan()) {
                        lifeSpan = flowers[i1].getLifeSpan();
                    }

                }
            }
        }
        float sum1 = sum * 0.1f + sum;
        String summ = String.format("%.2f", sum1) ;
        System.out.print(" на сумму " + summ + " рублей" + " срок стояния " + lifeSpan + " дней");

    }

    private static StringBuilder validData(StringBuilder s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='-' || s.charAt(i)==',') {
                s.deleteCharAt(i);
            }
        }
        return s;
    }


}