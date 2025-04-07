public class Car {
    protected String model;
    protected double speed;
    protected double fuel;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
        this.fuel = 100;
    }

    public void accelerate() {
        speed += 10;
        fuel -= 5;
        System.out.println(model + " accelerates. Speed: " + speed + " km/h, Fuel: " + fuel + "%");
    }

    public void brake() {
        speed -= 5;
        if (speed < 0) speed = 0;
        System.out.println(model + " brakes. Speed: " + speed + " km/h");
    }

    public void refuel() {
        fuel = 100;
        System.out.println(model + " refueled. Fuel: " + fuel + "%");
    }
}
