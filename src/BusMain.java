public class BusMain {
    public static void main(String[] args) {
        Bus cityBus = new Bus("Volvo City Bus");

        System.out.println("\n--- Bus Test ---");
        cityBus.passengerEnter();
        cityBus.passengerEnter();
        cityBus.passengerExit();

        cityBus.accelerate();
        cityBus.brake();
        cityBus.refuel();

        System.out.println("Current passenger count: " + cityBus.getPassengerCount());
    }
}
