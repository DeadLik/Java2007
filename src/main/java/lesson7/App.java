package lesson7;

public class App {
    public static void main(String[] args) {
        Car car = new Car(60);
        Car car2 = new Car(60);
        GasStation gasStation = new GasStation(1000);

        gasStation.info();

        car.takeGasoline(gasStation);
        car2.takeGasoline(gasStation);

        gasStation.info();



    }
}
