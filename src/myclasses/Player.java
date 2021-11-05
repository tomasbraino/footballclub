package myclasses;

public class Player extends Person {

    private String fieldPosition;
    private Integer height;
    private Integer weight;
    private String fieldPosition2;

    //methods

    public Player(String name, Integer phoneNumber, Integer id, String fieldPosition, Integer height, Integer weight, String fieldPosition2) {
        super(name, phoneNumber, id);

        this.fieldPosition = fieldPosition;
        this.fieldPosition2 = fieldPosition2;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String run() {
        return "the player is running with the ball";
    }

    @Override
    public String talk() {
        return "the player is talking with his partner";
    }

    @Override
    public String toString() {
        return "Field position: " + getFieldPosition() + "\n" +
                "Field position 2: " + getFieldPosition2() + "\n" +
                "Height: " + getHeight() + "\n" +
                "weight: " + getWeight();
    }

    //getters & setters

    public String getFieldPosition() {
        return fieldPosition;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getFieldPosition2() {
        return fieldPosition2;
    }

    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setFieldPosition2(String fieldPosition2) {
        this.fieldPosition2 = fieldPosition2;
    }
}
