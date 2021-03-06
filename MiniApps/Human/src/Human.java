public class Human {
    private String eyeColor;
    private String hairColor;
    private double height;
    private double weight;

    // best practice: always have a default constructor if you have an overloaded constructor
    public Human(){}

    // as soon as you make an overloaded constructor, compiler no longer inserts the default for you
    // that is why you should always be sure to insert it by hand...
    public Human(String eyeColor, String hairColor, double height, double weight) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
    }

    public void displayText(){
        System.out.println("Eye color is " + eyeColor);
        System.out.println("Hair color is " + hairColor);
        System.out.println("My weight is " + weight + " and my height is " + height);
    }


    public void talk(){
        System.out.println("Talking...");
    }

    // for auto-generated stuff; in IDE; option-click and select "Generate", then choose...
    // this toString was autogenerated
    @Override
    public String toString() {
        return super.toString() + " :: Human{\n" +
                "eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getHairColor(){
        return hairColor;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }



}
