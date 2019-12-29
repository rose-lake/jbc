
public class Car extends Vehicle {

//    INHERITED, not overridden, INFORMATION
//    String name;
//    String color;
//    double speed;

    public Car(){ super(); }
    public Car(String name, String color, double speed){
        super(name, color, speed);
        //System.out.println("In Car constructor");
    }

    public String getDescription() {
        return "This is a " + color + " " + name + " and it is going " + speed + " mph";
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String setSpeed(double speed) {
        this.speed = speed;
        return "The " + color + " " + name + " is going " + this.speed + " mph";
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public double getSpeed(){
        return speed;
    }


}
