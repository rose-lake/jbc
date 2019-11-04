public class Human {
    private String eyeColor;
    private String hairColor;
    private double height;
    private double weight;

    public Human(){}

    public Human(String eyeColor, String hairColor, double height, double weight) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
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
