package ClassInheritance1;

public class House {
    private int yearOfConstruction;
    private String address;
    private int numberOfRooms;
    private int area;

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    protected House() {

    }

    protected House(int numberOfRooms, int yearOfConstruction) {
    }

    protected House(String address, int numberOfRooms, int area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }


}
