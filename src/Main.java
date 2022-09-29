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

        LocalDate birthDay = LocalDate.of(1987, 4, 12);
        Human humanMax = new Human();
        humanMax.setName("Максим");
        humanMax.setCurrentCity("Минск");
        humanMax.setBirthDate(localDate.getYear() - birthDay.getYear());
        System.out.println(humanMax.getName() + " из города " + humanMax.getCurrentCity() + ", которому " +humanMax.getBirthDate() + " лет");

        birthDay = LocalDate.of(1993, 4, 12);
        Human humanAnya = new Human();
        humanAnya.setName("Аня");
        humanAnya.setCurrentCity("Москва");
        humanAnya.setBirthDate(localDate.getYear() - birthDay.getYear());
        System.out.println(humanAnya.getName() + " из города " + humanAnya.getCurrentCity() + ", которой " +humanAnya.getBirthDate() + " лет");

        birthDay = LocalDate.of(1994, 4, 12);
        Human humanKatya = new Human();
        humanKatya.setName("Катя");
        humanKatya.setCurrentCity("Калининград");
        humanKatya.setBirthDate(localDate.getYear() - birthDay.getYear());
        System.out.println(humanKatya.getName() + " из города " + humanKatya.getCurrentCity() + ", которой " +humanKatya.getBirthDate() + " лет");

        birthDay = LocalDate.of(1995, 4, 12);
        Human humanArtem = new Human();
        humanArtem.setName("Артем");
        humanArtem.setCurrentCity("Москва");
        humanArtem.setBirthDate(localDate.getYear() - birthDay.getYear());
        System.out.println(humanArtem.getName() + " из города " + humanArtem.getCurrentCity() + ", которому " +humanArtem.getBirthDate() + " лет");

    }
}