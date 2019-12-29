
public class Main {

    public static void main(String[] args) {
        Car redPorsche = new Car("Porsche", "red", 0);
        Plane blueCessna = new Plane("Cessna", "blue", 500, 2000);
        Boat greyDestroyer = new Boat("Destroyer", "grey", 45);
        Car blueJetta = new Car("Jetta", "blue", 25);

        System.out.println("\n\nDriving two cars!");
        System.out.println(redPorsche.start());
        System.out.println(redPorsche.accelerate());
        System.out.println(blueJetta.start());
        System.out.println(blueJetta.accelerate());
        System.out.println(blueJetta.setSpeed(110));
        System.out.println(redPorsche.setSpeed(109));
        System.out.println(redPorsche.decelerate());
        System.out.println(redPorsche.stop());

        System.out.println("\n\nFlying our Plane!");
        System.out.println(blueCessna.run());
        System.out.println(blueCessna.fly());
        System.out.println(blueCessna.increaseAltitude());
        System.out.println(blueCessna.accelerate());
        System.out.println(blueCessna.land());
        System.out.println(blueCessna.takeOff());
        System.out.println(blueCessna.decreaseAltitude());
        System.out.println(blueCessna.setSpeed(500));
        System.out.println(blueCessna.decreaseAltitude());
        System.out.println(blueCessna.decreaseAltitude());
        System.out.println(blueCessna.decreaseAltitude());
        System.out.println(blueCessna.decreaseAltitude());
        System.out.println(blueCessna.decreaseAltitude());

        System.out.println("\n\nFloating on our Boat!");
        System.out.println(greyDestroyer.floating());
        System.out.println(greyDestroyer.accelerate());

        System.out.println("\n\nSo long! That was fun!");
    }

}
