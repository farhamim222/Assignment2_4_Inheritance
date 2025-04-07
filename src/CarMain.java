public class CarMain {
    public static void main(String[] args) {
        Car regularCar = new Car("Toyota Corolla");
        SportsCar sportsCar = new SportsCar("Ferrari F8");

        System.out.println("\n--- Regular Car ---");
        regularCar.accelerate();
        regularCar.brake();
        regularCar.refuel();

        System.out.println("\n--- Sports Car ---");
        sportsCar.accelerate();
        sportsCar.brake();
        sportsCar.refuel();
    }
}

