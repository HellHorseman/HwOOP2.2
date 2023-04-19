public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation service = new ServiceStation();
        service.check(car, null, null);
        service.check(car2, null, null);
        service.check(null, bicycle, null);
        service.check(null, bicycle2, null);
        service.check(null, null, truck);
        service.check(null, null, truck2);
    }

}