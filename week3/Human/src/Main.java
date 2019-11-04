import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    // shortcut: psvm :: public static void main  (!)   ;)
    public static void main(String[] args) {

        //**************************
        // Examples on Human class
        //**************************
        Human human1 = new Human();
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

//        //****************************
//        // ORIGINAL examples of HumanDB class
//        //****************************
//        // simple instantiation of HumanDB class
//        HumanDB humanDB = new HumanDB();
//        humanDB.setHumanDB(humanArrayList);
//        // humanDB attribute is an array list ! ;) So the enhanced for loop will work the same way
//        for(Human h : humanDB.getHumanDB()) {
//            System.out.println("____________________");
//            h.displayText();
//        }

        //**************************
        // examples on Child class
        // including Brain instance
        //**************************
        Child child = new Child();
        Brain brain = new Brain();

        // this demo's polymorphism: when a parent's method is overridden by a child
        System.out.println("**************************");
        System.out.println("Demonstrating method overriding - human talks; child talks");
        human1.talk();
        child.talk();

        // composition, however, is when you have classes within classes
        brain.setBrainCells(100);
        brain.setiQ(100);

        child.setMood("happy");
        child.setBrain(brain);
        child.setEyeColor("Blue");
        child.setHairColor("Black");
        child.setHeight(45);
        child.setWeight(130);

        System.out.println("**************************");
        System.out.println("Demonstrating Child + Brain composition, also linked toString() calls!!!!");
        // printing out child via toString() override which also calls parent class's toString override!
        System.out.println(child.toString());

        System.out.println("**************************");
        System.out.println("Demonstrating toString() calls :) :) :) ");
        System.out.println(human1.toString());
        System.out.println(child.toString());
        System.out.println(brain.toString());

        //*************************************
        // SINGLETON examples of HumanDB class
        //**************************************
        // the only way to construct a HumanDB (SINGLETON) instance is to call getInstance()
        // this is how the SINGLETON pattern *works*!!
        HumanDB databaseA = HumanDB.getInstance();
        System.out.println("DATABASE A :: " + databaseA.toString());
        HumanDB databaseB = HumanDB.getInstance();
        System.out.println("DATABASE B :: " + databaseB.toString());

        // set up an alternate hashmap, to test persistence of SINGLETON-ness
        Human h1 = new Human("Silver", "Red", 44, 100);
        Human h2 = new Human("Hazel", "Green", 66, 144);
        HashMap<Integer, Human> myMap= new HashMap<>();
        myMap.put(1, h1);
        myMap.put(2,h2);
        System.out.println("myMap :: " + myMap.toString());

        // using getHumanDB()
        HashMap<Integer,Human> getMapA = databaseA.getHumanDB();
        System.out.println("getMapA :: " + getMapA.toString());

        // using setHumanDB()
        databaseA.setHumanDB(myMap);
        System.out.println("************* testing setHumanDB() *************");
        System.out.println("DATABASE A :: " + databaseA.toString());
        System.out.println("DATABASE B :: " + databaseB.toString());

        // yes, it works as expected. The SINGLETON pattern works.

        // ********************** FUTURE NOTE for SPRINGBOOT ********************
        // In springboot you will use "@ AutoWired" to ensure there is only one instance
        // **********************************************************************
        
    }

    // this shows another way to do it as opposed to defining the display method in the Human class
    // we now have both options available to us.
    private static void display(Human h){
        System.out.println("Eye color is " + h.getEyeColor());
        System.out.println("Hair color is " + h.getHairColor());
        System.out.println("My weight is " + h.getWeight() + " and my height is " + h.getHeight());
    }

}
