public class Boat extends Vehicle {

    public Boat(){ super(); }
    public Boat(String name, String color, double speed){
        super(name, color, speed);
        System.out.println("In Boat constructor");
    }

    @Override
    public String setSpeed(double speed){
        return "The boat is travelling at " + speed + " knots";
    }

}
