public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(15000);
        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);

        System.out.println();

        System.out.println("Грузовик номер 2! А мне можно?");
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);
    }
}
