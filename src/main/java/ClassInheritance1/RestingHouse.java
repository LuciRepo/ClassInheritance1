package ClassInheritance1;

public class RestingHouse extends House {
    private String heatingSystemType;

    public String getHeatingSystemType() {
        return heatingSystemType;
    }

    public void setHeatingSystemType() {
        this.heatingSystemType = heatingSystemType;
    }
    protected RestingHouse(){

    }
    protected RestingHouse(String address,int numberOfRooms,int area,String heatingSystemType){
        super(address,numberOfRooms,area);
        this.heatingSystemType="Wood Pelets";
    }
    protected RestingHouse(int numberOfRooms,int yearOfConstruction){
        super(numberOfRooms,yearOfConstruction);
    }
}
