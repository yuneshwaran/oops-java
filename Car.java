public class Car {
    public int makeYear;
    public String brand;
    public String model;
    public int state;

    Car(String brand){
        this.brand = brand;
    }
    Car(){
        
    }
    //constructor
    Car(String brand,String model,int makeYear){
        this.brand = brand;
        this.model = model;
        this.makeYear = makeYear;
        System.out.println("A "+brand +"Car is created!!!");
        this.state = 0;
    }

    //getters setters
    public int getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void printer(){
        System.out.println("Brand : "+ brand);
        System.out.println("Model :"+ model);
        System.out.println("Make Year :"+ makeYear);
    }

    public void startCar(){
        if(state==0) {
            state = 1; ;
            System.out.println("Car Stared");
        }
        else 
            System.out.println("Car is already Running!!");
    }
    public void stopCar(){
        if(state==1) {
            state = 0; ;
            System.out.println("Car Stopeed");
        }
        else 
            System.out.println("Car is not running!!");
    }

}
