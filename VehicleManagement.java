
public class VehicleManagement {
    public static void main(String[] args) {
        System.out.println("Do something");
    }
}

interface ElectricVehicle{

    void charge();
}

interface HybridCar{

    void switchmode();
}

class ElectricHybrid implements ElectricVehicle,HybridCar{

    public void switchmode() {

    }
    public void charge(){

    }

}
