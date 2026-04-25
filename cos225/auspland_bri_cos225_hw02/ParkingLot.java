public class ParkingLot{
    ParkingSpot[] spot_array;

    public ParkingLot(ParkingSpot[] spot_array){
        this.spot_array = spot_array;
    }

    public int ParkCar(Car car){
        int i;
        for (i = 0; i<spot_array.length; i++){
            if (car.handicap == spot_array[i].handicap_spot){
                spot_array[i].parked_car = car;
                break;
            }
        }
        return i;
    }

    public Car LeavingCar(int spot_num){
        Car leaving_car = spot_array[spot_num].parked_car;
        spot_array[spot_num].parked_car = null;
        return leaving_car;
    }

    public String to_string(){
        int handis = 0;
        int total = 0;
        for (int i = 0; i < spot_array.length; i++) {
            if (spot_array[i].handicap_spot && spot_array[i].parked_car == null){
                handis += 1;
            }
            else if (!spot_array[i].handicap_spot && spot_array[i].parked_car == null) {
                total += 1;
            }
        }

        return "" + handis + " " + total;
    }
}