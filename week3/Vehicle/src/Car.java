
public class Car extends Vehicle {

//    INHERITED, not overridden, INFORMATION
//    String name;
//    String color;
//    double speed;

    public Car(){ super(); }
    public Car(String name, String color, double speed){
        super(name, color, speed);
        System.out.println("In Car constructor");
    }

    @Override
    public String setSpeed(double speed) {
        this.speed = speed;
        return "The " + color + " " + name + " is going " + this.speed + "mph";
    }

}
