public class Car {

  private  String color;
   private String brand;
   private  String model;
    private int year;
    private int speed;

    // Constructor of Fixed data

    public  Car( String brand , String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Getters ( read Only )
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getYear() {return year;}


    // Speed
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Color
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public void accelerate (int increment){
        speed += increment;
    }

    public void decrement (int decrement ){
        speed -= decrement;
    }
}





