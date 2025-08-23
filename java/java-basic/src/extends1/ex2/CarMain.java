package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.move();
        car.charge();

        GasCar gas = new GasCar();
        gas.move();
        gas.fillUp();
    }
}
