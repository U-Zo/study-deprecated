package workshop07.ship;

public class Cruise extends Ship {
    public Cruise() {
    }

    public Cruise(String shipName, int fuelTank) {
        super(shipName, fuelTank);
    }

    @Override
    public void sail(int dist) {
        int fuelTank = super.getFuelTank();
        fuelTank -= dist * 13;
        super.setFuelTank(fuelTank);
    }

    @Override
    public void refuel(int fuel) {
        int fuelTank = super.getFuelTank();
        fuelTank += fuel * 8;
        super.setFuelTank(fuelTank);
    }
}