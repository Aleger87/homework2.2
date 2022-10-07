import java.util.Arrays;

public class Flower {
   private String name;
   private String flowerColor;
   private String country;
   private float cost;
   private int lifeSpan;
   private int id;

   private Flower[] flowers;

    private static int counter = 0;

    public Flower(String name, String country, float cost) {
        this (name,country,cost,3, "белый");
    }

    public Flower(String name,  String country, float cost, int lifeSpan, String flowerColor) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
        this.name = name;
        id = counter;
        counter++;
        flowers = new Flower[0];

    }

    public void setFlowerColor(String flowerColor) {

        if (this.flowerColor == null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public void setCountry(String country) {
        if (this.country == null) {
            this.country = country;
        } else{
            this.country = "Россия";
        }

    }
    public void setCost(float cost) {
        if (this.cost <=0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }



    public Flower[] getFlowers() {
        if (flowers == null){
            flowers = new Flower[0];
        }
        return flowers;
    }

    public void addFlowers (Flower flower){
        this.flowers = Arrays.copyOf(getFlowers(),  getFlowers().length+1);
        this.flowers[this.flowers.length-1] = flower;
    }
    public String getName() {
        return name;
    }
    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }



    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int getId() {
        return id;
    }



}
