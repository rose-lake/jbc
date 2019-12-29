public abstract class Vehicle {

    // when no access modifier is used, it is "package-private"

    String name;
    String color;
    double speed;

    Vehicle(){}

    public Vehicle(String name, String color, double speed) {
        //System.out.println("In Vehicle constructor");
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    String start(){
        return "The " + color + " " + name + " is starting";
    }

    String run(){
        return "The " + color + " " + name + " is running";
    }

    String accelerate(){
        speed += 10;
        return "The " + color + " " + name + " is accelerating";
    }

    String decelerate(){
        speed -= 10;
        if (speed < 0) { speed = 0;};
        return "The " + color + " " + name + " is decelerating";
    }

    String stop(){
        return "The " + color + " " + name + " is stopped";
    }


    abstract String getName();
    abstract void setName(String name);
    abstract String getColor();
    abstract void setColor(String color);
    abstract double getSpeed();
    // Note: setSpeed has a special specification in that it returns String
    abstract String setSpeed(double speed);

}
