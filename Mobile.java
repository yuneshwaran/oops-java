public class Mobile extends Computer{
    
    int screenSize;
    int price;

    Mobile(String brand, int year,int screenSize,int price){

        super(brand,year);
        this.screenSize = screenSize;
        this.price = price;

    }

    public void display(){
        
        System.out.println("Mobile brand:"+ this.brand);
        System.out.println("Mobile  Screen size :"+ this.screenSize);
        System.out.println("Mobile price: "+this.price);

    }
}
