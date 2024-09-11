
//8.Create a class Laptop with attributes brand and price. Implement a method display_specs() 
//that prints the brand and price. Instantiate a Laptop object and call display_specs().

public class Laptop extends Computer{

    String model;
    int price;

    Laptop(String model, int price){
        
        System.out.println("Laptop Created");
        super();
        this.model = model;
        this.price = price;

    }

    //getter setter
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

    public void setPrice(int price){
        this.price = price ;  
     }
    public int getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println("Laptop brand:"+ this.brand);
        System.out.println("Laptop model :"+ this.model);
        System.out.println("Laptop price: "+this.price);

    }



}
