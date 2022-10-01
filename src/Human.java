public class Human {

    private int birthDate;
    private String name;
    private String currentCity;
    private String position;

    public Human(String name, int birthDate,  String currentCity, String position) {
        this.birthDate = birthDate;
        this.name = name;
        this.currentCity = currentCity;
        this.position = position;

    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public String getName() {
        return name;
    }
    public String getCurrentCity() {
        return currentCity;
    }
    public int getBirthDate() {
        return birthDate;
    }




}
