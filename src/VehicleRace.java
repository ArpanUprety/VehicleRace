import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Random;

public class VehicleRace {


    public static final int DISTANCE_TO_FINISH = 500;

    public static final int MILIDELAY = 1000;


    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Lada", ReturnRandomSpeed(), 0);
        Vehicle v2 = new Vehicle("Alfa Romero", ReturnRandomSpeed(), 0);
        StartRace(v1,v2);

    }

    public static int ReturnRandomSpeed(){

        int MinInitialSpeed = 95;
        Random rand = new Random();
        return (MinInitialSpeed+= (rand.nextInt(10)));
    };

    public static void StartRace(Vehicle v1, Vehicle v2){
        System.out.println(v1.getBrand() + " is racing " + v2.getBrand());
        while(v1.getDistance() < DISTANCE_TO_FINISH && v2.getDistance() < DISTANCE_TO_FINISH){
            v1.UpdateDistance();
            v2.UpdateDistance();
            System.out.println(v1.getBrand() + " travelled " + v1.getDistance());
            System.out.println(v2.getBrand() + " travelled " + v2.getDistance());
            try {
                Thread.sleep(MILIDELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            v1.setSpeed(ReturnRandomSpeed());
            v2.setSpeed(ReturnRandomSpeed());

        }
        if (v1.getDistance() >= DISTANCE_TO_FINISH && v1.getDistance() >=  v2.getDistance()){
            System.out.println(v1.getBrand() + " has Won!!");
        }else{
            System.out.println(v2.getBrand() + " has Won!!");
        }
        if (v1.getDistance() ==  v2.getDistance()  )
        {
            System.out.println("No Car WON, TIE!!!");
        }
    }

}