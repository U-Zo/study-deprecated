package workshop07.ship;

public class Boat extends Ship {
    public Boat() {
    }

    public Boat(String shipName, int fuelTank) {
        super(shipName, fuelTank);
    }

    @Override
    public void sail(int dist) {
        int fuelTank = super.getFuelTank();
        fuelTank -= dist * 10;
        super.setFuelTank(fuelTank);
    }

    @Override
    public void refuel(int fuel) {
        int fuelTank = super.getFuelTank();
        fuelTank += fuel * 10;
        super.setFuelTank(fuelTank);
    }
}
