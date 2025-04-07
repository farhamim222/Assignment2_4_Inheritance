public class Bus extends Car {
    private int passengerCount;

    public Bus(String model) {
        super(model);
        this.passengerCount = 0;
    }

    public void passengerEnter() {
        passengerCount++;
        System.out.println("One passenger entered. Total passengers: " + passengerCount);
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("One passenger exited. Total passengers: " + passengerCount);
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public void accelerate() {
        speed += 8;
        fuel -= 6;
        System.out.println(model + " (Bus) accelerates. Speed: " + speed + " km/h, Fuel: " + fuel + "%");
    }

    @Override
    public void brake() {
        speed -= 4;
        if (speed < 0) speed = 0;
        System.out.println(model + " (Bus) slows down. Speed: " + speed + " km/h");
    }
}
