import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        Максим из города Минск, которому 35 лет
        Аня из города Москва, которой 29 лет
        Катя из города Калининград, которой 28 лет
        Артем из города Москва, которому 27 лет
        * */
        task1_2();
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

    }
}