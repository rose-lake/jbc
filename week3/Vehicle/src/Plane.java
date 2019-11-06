public class Plane extends Vehicle {

//    INHERITED, not overridden, INFORMATION
//    String name;
//    String color;
//    double speed;

    private double altitude;            // in feet

    public Plane(){ super(); }
    public Plane(String name, String color, double speed, double altitude){
        super(name, color, speed);
        this.altitude = altitude;
        System.out.println("In Plane constructor");
    }

    @Override
    public String setSpeed(double speed){
        this.speed = speed;
        return "The plane is going " + this.speed + "mph at an altitude of " + altitude + " feet";
    }

    public String increaseAltitude(){
        altitude += 1000;
        return "The plane's altitude has increased to " + altitude + " feet";
    }

    public String decreaseAltitude() {
        altitude -= 1000;

        if (altitude < 0) {
            altitude = 0;
            return "The plane has crashed.";
        } else {
            return "The plane's altitude has decreased to " + altitude + " feet";
        }
    }

    public String takeOff(){
        altitude = 5000;
        speed = 300;
        return "The plane has successfully taken off!";
    }

    public String fly() {
       return "The plane is flying " + speed + " mph at an altitude of " + altitude + " feet";
    }

    public String land() {
        altitude = 0;
        return "The plan has landed! Huzzah!";
    }



}
