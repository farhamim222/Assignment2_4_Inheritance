public class SportsCar extends Car {

    public SportsCar(String model) {
        super(model);
    }

    @Override
    public void accelerate() {
        speed += 20;
        fuel -= 10;
        System.out.println(model + " (SportsCar) accelerates FAST! Speed: " + speed + " km/h, Fuel: " + fuel + "%");
    }

    @Override
    public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;
        System.out.println(model + " (SportsCar) brakes hard. Speed: " + speed + " km/h");
    }
}
