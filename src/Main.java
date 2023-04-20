public class Main {
    public static void main(String[] args) {
        WheelTransport car = new Car("car1", 4);
        WheelTransport car2 = new Car("car2", 4);

        WheelTransport truck = new Truck("truck1", 6);
        WheelTransport truck2 = new Truck("truck2", 8);

        WheelTransport bicycle = new Bicycle("bicycle1", 2);
        WheelTransport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation service = new ServiceStation();
        service.check(car);
        service.check(car2);
        service.check(bicycle);
        service.check(bicycle2);
        service.check(truck);
        service.check(truck2);
    }

}