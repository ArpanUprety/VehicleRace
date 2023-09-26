import java.security.PublicKey;

public class Vehicle {


    private String brand;
    private int speed;

    private int distance;




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vehicle(String brand, int speed, int distance){
            setBrand(brand);
            setDistance(distance);
            setSpeed(speed);
    }

    public Vehicle(){
        this.brand = "";
        this.speed = 0;
        this.distance = 0;
    }

  public int UpdateDistance(){
   return this.distance+=speed;
  }
}
