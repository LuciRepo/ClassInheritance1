package ClassInheritance1;

public class Flat extends House {
    //private House house=new House("Oradea-Nufarul",3,80); daca foloseam compozitie
    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    protected Flat() {

    }

    protected Flat(String address, int numberOfRooms, int area, int floor) {
        super(address, numberOfRooms, area);
        this.floor = floor;
    }
}
