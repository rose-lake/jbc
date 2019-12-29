public class Child extends Human {
    private String mood;
    private Brain brain;
    private boolean happy;

    public Child(){}

    public String getMood(){
        return mood;
    }

    public void setMood(String mood){
        this.mood = mood;
    }

    // best practice: You would then access Brain's methods directly out of your main() method
    // you don't write methods here in Child that go in and access stuff of Brain for you
    // you assume that the author of main() has access to all the interfaces and information of each class
    public Brain getBrain(){
        return brain;
    }

    public void setBrain(Brain brain){
        this.brain = brain;
    }

    // note the slight difference in the name of the getter. cool! :)
    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    // you need to include this special @Override ! :)
    @Override
    public void talk(){
        System.out.println("Bla bla bla...");
    }

    @Override
    public String toString() {
        return super.toString() + " :: Child{\n" +
                "mood='" + mood + '\'' +
                ", brain=" + brain +
                ", happy=" + happy +
                '}';
    }
}
