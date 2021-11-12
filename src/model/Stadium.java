package model;

public class Stadium implements StadiumIn {

    private String name;
    private int capacity;

    //methods
    public Stadium(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public void alertSound() {
        System.out.println("Please evacuate the stadium");
    }

    @Override
    public void messageSound() {
        System.out.println("The striker score!!! ");
    }

    @Override
    public void controlFans() {
        System.out.println("Dear fans, please check your fanId");
    }

    @Override
    public void security() {
        System.out.println("Security on the pitch");
    }
}
