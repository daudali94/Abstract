package peaksoft;

public class Horse extends Animal{
    private String color;


    public Horse(float weight, byte age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public Horse(float weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
