import java.util.ArrayList;

public class ChipotleObjects {

    public static void main(String[] args) {

        // constructing and printing the LONG WAY ...
        Burrito burrito1 = new Burrito();               // we can "see" Burrito because they are in the same source folder
        burrito1.setRice("white rice");                 // note: parameter required
        burrito1.setBean("black beans");                // r.nextInt(length_options_array)
        burrito1.setMeat("chicken");
        burrito1.setSalsa("hot salsa");
        burrito1.setVeggies("lettuce");
        System.out.println("Burrito 1: " + burrito1.getRice() + ", " + burrito1.getBean() + ", " +
                burrito1.getMeat() + ", " + burrito1.getSalsa() + ", " + burrito1.getVeggies() + ".");
        // using a new method!
        burrito1.displayText(1);

        // initialize an array list of burrito class
        ArrayList<Burrito> burritosList = new ArrayList<>();

        // initialize an array of burrito class
        Burrito[] burritosArray = new Burrito[25];
        
    }
}
