package ClassInheritance1;

public class Home extends House {
    private int numberOfFloors;

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors() {
        this.numberOfFloors = numberOfFloors;
    }

    protected Home() {
    }

    protected Home(String address, int numberOfRooms, int area, int numberOfFloors) {
        super(address, numberOfRooms, area);
        this.numberOfFloors = numberOfFloors;
    }

}
