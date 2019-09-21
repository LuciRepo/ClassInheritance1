package ClassInheritance1;

public class Main {
    public static void main(String[] args) {
        House firstHouse = new House("Oradea, Nufarul", 6, 200);
        House secondHouse = new House("Baile Felix", 4, 130);
        Flat firstFlat=new Flat("Baile Felix",2,40,2);
        Flat secondFlat=new Flat("Baile Felix",3,60,3);
        Home firstHome= new Home("Countryside",3,45,1);
        Home secondHome=new Home("Countryside",4,78,2);
        RestingHouse firstRestingHouse=new RestingHouse("Baile 1 Mai",2,34,"Wood Pellets");
        RestingHouse secondRestingHouse=new RestingHouse(2,2009);
    }
}
