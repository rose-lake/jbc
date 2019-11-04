import java.util.ArrayList;
import java.util.Collections;

public class Main {

    // shortcut: psvm :: public static void main  (!)   ;)
    public static void main(String[] args) {

        Human human1 = new Human();
        Child child = new Child();
        Human human2 = new Human();

        human1.setEyeColor("Black");
        human1.setHairColor("Grey");
        human1.setHeight(56);
        human1.setWeight(156);

        human2.setEyeColor("White");
        human2.setHairColor("Brown");
        human2.setHeight(64);
        human2.setWeight(190);

        ArrayList<Human> humanArrayList = new ArrayList<>();    // shorthand form is the empty <> (shorthand for <Human>)
        // add one by one
        //humanArrayList.add(human1);
        //humanArrayList.add(human2);
        // or... add all at once!
        Collections.addAll(humanArrayList, human1,human2);

        for(Human h : humanArrayList) {
            System.out.println("**************************");
            System.out.println("Method inside class Human");
            h.displayText();

            System.out.println("**************************");
            System.out.println("Method inside Main class");
            display(h);
        }

        // simple instantiation of HumanDB class
        HumanDB humanDB = new HumanDB();
        humanDB.setHumanDB(humanArrayList);
        // humanDB attribute is an array list ! ;) So the enhanced for loop will work the same way
        for(Human h : humanDB.getHumanDB()) {
            System.out.println("____________________");
            h.displayText();
        }

        // In springboot you will use "@ AutoWired" to ensure there is only one instance
        // HumanDB humanDB1 = new HumanDB();
        // HumanDB humanDB2 = new HumanDB();
        // these will be two different databases! ... at Present... Given the HumanDB class as it stands

        // this demo's polymorphism: when a parent's method is overriden by a child
        System.out.println("**************************");
        System.out.println("Demonstrating method overriding - human talks; child talks");
        human1.talk();
        child.talk();

        // composition, however, is when you have classes within classes
        Brain childsbrain = new Brain();
        childsbrain = child.getBrain();

    }

    // this shows another way to do it as opposed to defining the display method in the Human class
    // we now have both options available to us.
    private static void display(Human h){
        System.out.println("Eye color is " + h.getEyeColor());
        System.out.println("Hair color is " + h.getHairColor());
        System.out.println("My weight is " + h.getWeight() + " and my height is " + h.getHeight());
    }

}
