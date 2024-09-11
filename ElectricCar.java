public class ElectricCar extends Car{


    private int batterySize;

    ElectricCar(int batterySize){
        this.batterySize = batterySize;
    }
    //constructor
    ElectricCar(String brand,String model,int makeYear,int batterySize){

        super(brand,model,makeYear);
        this.batterySize = batterySize;
    }



    public void printer(){
        System.out.println("Brand : "+ brand);
        System.out.println("Model :"+ model);
        System.out.println("Make Year : "+makeYear);
        System.out.println("Battery Size :"+batterySize+"kWh");

    }
}
