public class LuxuryEV extends ElectricCar{

    String interior;
    int batterySize;

    LuxuryEV(String brand,String model,int makeYear,int batterySize,String interior){

        super(brand,model,makeYear,batterySize);
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void display(){
        System.out.println("Brand : "+ brand);
        System.out.println("Model :"+ model);
        System.out.println("Make Year : "+makeYear);
        System.out.println("Battery Size :"+batterySize+"kWh");

    }
    
}
