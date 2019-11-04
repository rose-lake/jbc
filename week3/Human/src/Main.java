
public class Main {

    // shortcut: psvm
    public static void main(String[] args) {

        Human human = new Human();
        Child child = new Child();
        Human human2 = new Human();

        // this demo's polymorphism: when a parent's method is overriden by a child
        human.talk();
        child.talk();

        // composition, however, is when you have classes within classes
        Brain childsbrain = new Brain();
        childsbrain = child.getBrain();

        // remember, if you were to make a classroom:
        // you make an Array or ArrayList of Human class...

        // notice the different syntax for a boolean variable (see Child)
        // SpringBoot is OPINIONATED and the NAMING CONVENTIONS matter...
        // getters and setters...

    }

}
