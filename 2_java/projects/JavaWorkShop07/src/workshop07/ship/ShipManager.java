package workshop07.ship;

import java.util.ArrayList;

public class ShipManager {
    private ArrayList<Ship> list;

    public ShipManager() {
        list = new ArrayList<>();
    }

    public void add(Ship s) {
        list.add(s);
    }

    public void sail() {
        for (Ship s : list) {
            s.sail(10);
        }
    }

    public void refuel() {
        for (Ship s : list) {
            if (s instanceof Boat) {
                s.refuel(20);
            } else {
                s.refuel(30);
            }
        }
    }

    public void printList() {
        System.out.println("shipName\tfuelTank");
        System.out.println("-------------------------");
        for (Ship s : list) {
            if (s instanceof Boat) {
                System.out.println(s.getShipName() + "\t\t" + s.getFuelTank());
            } else {
                System.out.println(s.getShipName() + "\t" + s.getFuelTank());
            }
        }
    }

    public ArrayList<Ship> getList() {
        return list;
    }
}
