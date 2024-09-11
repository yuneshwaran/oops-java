public class Desktop extends Computer {
    
String cpu;

    Desktop(String brand, int year , String cpu){
        
        super(brand,year);
        this.cpu = cpu;

    }

    public void display(){
        System.out.println("Desktop details");
        System.out.println("Desktop Brand : "+ brand);
        System.out.println("Make year : "+ year);
    }
}
