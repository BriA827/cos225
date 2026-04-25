public class ParkingTester{
    public static void main(String[] args){
    ParkingSpot[] spots = {
        new ParkingSpot(false),
        new ParkingSpot(true),
        new ParkingSpot(false),
        new ParkingSpot(false),
        new ParkingSpot(false),
        new ParkingSpot(false),
        new ParkingSpot(false),
        new ParkingSpot(true)
    };

    ParkingLot lot = new ParkingLot(spots);
    System.out.println(lot.to_string());

    Car car1 = new Car("Ford", "Blue", true);
    int car1_park = lot.ParkCar(car1);

    System.out.println(lot.to_string());

    Car car2 = new Car("Mazda", "Black", false);
    lot.ParkCar(car2);

    System.out.println(lot.to_string());

    lot.LeavingCar(car1_park);

    System.out.println(lot.to_string());
    }
}