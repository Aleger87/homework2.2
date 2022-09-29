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
        LocalDate localDate = LocalDate.now();

        LocalDate birthDayNax = LocalDate.of(1987, 4, 12);
        Human humanMax = new Human();
        humanMax.setName("Максим");
        humanMax.setCurrentCity("Минск");
        humanMax.setBirthDate(localDate.getYear() - birthDayNax.getYear());
        humanMax.setPosition("бренд-менеджером");
        System.out.println(humanMax.getName() + " из города " + humanMax.getCurrentCity() + ", которому " +humanMax.getBirthDate() + " лет");


        LocalDate birthDayAnya = LocalDate.of(1993, 4, 12);
        Human humanAnya = new Human();
        humanAnya.setName("Аня");
        humanAnya.setCurrentCity("Москва");
        humanAnya.setBirthDate(localDate.getYear() - birthDayAnya.getYear());
        humanAnya.setPosition("методистом образовательных программ");
        System.out.println(humanAnya.getName() + " из города " + humanAnya.getCurrentCity() + ", которой " +humanAnya.getBirthDate() + " лет");

        LocalDate birthDayKatya = LocalDate.of(1994, 4, 12);
        Human humanKatya = new Human();
        humanKatya.setName("Катя");
        humanKatya.setCurrentCity("Калининград");
        humanKatya.setBirthDate(localDate.getYear() - birthDayKatya.getYear());
        humanKatya.setPosition("продакт-менеджером");
        System.out.println(humanKatya.getName() + " из города " + humanKatya.getCurrentCity() + ", которой " +humanKatya.getBirthDate() + " лет");

        LocalDate birthDayArtem = LocalDate.of(1995, 4, 12);
        Human humanArtem = new Human();
        humanArtem.setName("Артем");
        humanArtem.setCurrentCity("Москва");
        humanArtem.setBirthDate(localDate.getYear() - birthDayArtem.getYear());
        humanArtem.setPosition("директором по развитию бизнеса");
        System.out.println(humanArtem.getName() + " из города " + humanArtem.getCurrentCity() + ", которому " +humanArtem.getBirthDate() + " лет");

        System.out.println("Привет! Меня зовут "+humanMax.getName()+
                            "\nЯ из города " +humanMax.getCurrentCity() +
                            "\nЯ родился в "+ birthDayNax.getYear()+" году. " +
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
}