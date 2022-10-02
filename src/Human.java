public class Human {

    private int birthDate;
    private String name;
    private String currentCity;
    private String position;


    public Human() {
        new Human(null,0,null,null);
    }

    public Human(String name, int birthDate,  String currentCity, String position) {
        if (name == null || currentCity == null || position == null) {
            System.out.println("Информация не указана");
        }
        if (birthDate >= 0){
            this.birthDate = birthDate;
        } else {
            this.birthDate = Math.abs(birthDate);
        }


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
