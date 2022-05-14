package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
    private List <String> passengers;
    private int maxPassengers;
    private Date lastTookOffTime;
    private Date lastLandedTime;

    public Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onBoard(String passenger){
        this.passengers.add(passenger);
    }

    public Date takeOff(){
        this.lastTookOffTime = new Date();
        return lastTookOffTime;
    }

    public void land(){
        this.lastLandedTime = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded(){
        return lastLandedTime;
    }

    public List<String> getPassengers(){
        return passengers;
    }

}
public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);

        plane.onBoard("Kirtee");
        plane.onBoard("Shaurya");
        plane.onBoard("Dhairya");
        plane.onBoard("Sahil");

        System.out.println("Plane took off at: "+ plane.takeOff());
        System.out.println("People on the plane: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();

        System.out.println("Plane landed at:"+ plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: "+ plane.getPassengers());
    }
}
