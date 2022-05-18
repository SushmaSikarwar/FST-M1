package activities;

interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations{
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current Speed: " + currentSpeed);
    }

    public void applyBreak(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + decrement);
    }

    public String biCycleDesc() {
        return ("No. of gears are " + gears +"\nSpeed of bicycle is " + currentSpeed);
    }
}

    class MountainBike extends Bicycle {

        public int seatHeight;

        public MountainBike(int gears, int currentSpeed, int startHeight){
            super(gears, currentSpeed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue){
            seatHeight = newValue;
        }

        public String biCycleDesc(){
            return (super.biCycleDesc() +"\nSeat height is "+ seatHeight);
        }
    }
public class Activity7 {

    public static void main(String[] args){

        MountainBike mb = new MountainBike(3,0,25);
        System.out.println(mb.biCycleDesc());
        mb.speedUp(20);
        mb.applyBreak(5);
    }
}
