public class Computer {
    
    String brand;
    int year;

    Computer(){}

    Computer(String brand, int year){
        
        System.out.println("Computer with param");
        this.brand = brand;
        this.year = year;

    }

    public void printer(){
        System.out.println("Computer brand: "+brand);
        System.out.println("Computer make year : "+year);

    }

    

}
