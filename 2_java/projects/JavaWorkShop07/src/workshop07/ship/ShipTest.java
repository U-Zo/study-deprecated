package workshop07.ship;

public class ShipTest {
    public static void main(String[] args) {
        ShipManager shipManager = new ShipManager();
        shipManager.add(new Boat("Boat01", 500));
        shipManager.add(new Cruise("Cruise01", 500));
        shipManager.printList();
        System.out.println();
        System.out.println("10 운항");
        shipManager.sail();
        shipManager.printList();
        System.out.println();
        System.out.println("20, 30 주유");
        shipManager.refuel();
        shipManager.printList();
    }
}
