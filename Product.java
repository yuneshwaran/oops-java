//8.Define a class Product with properties name and price, and a method display(). Create two subclasses Electronics 
//and Clothing that extend Product and add additional properties (warrantyPeriod for Electronics and size for Clothing). 
//Write a main method to create instances of both subclasses and display their details.

public class Product {
    String name;
    int price;

    Product(String name,int price){
        this.name = name;
        this.price= price;
    }

    public void details(){
        System.out.println("Produt name : "+ this.name);
        System.out.println("Product cost : "+ this.price);
    }
}

class Electronics extends Product {

    int warranty;
    String type;

    Electronics(String name, int price , String type,int warranty){

        super(name, price);
        this.type = type;
        this.warranty = warranty;

    }
    public void details(){
        System.out.println("Electronics details");
        super.details();
        System.out.println("Warranty period : "+ this.warranty);
    }
    
}

class Clothing extends Product{

    String theme;
    int size;
    Clothing(String name, int price , String theme,int size)
    {
        super(name, price);
        this.theme = theme;
        this.size = size;

    }
    public void details(){
        System.out.println("Clothing details");
        super.details();
        System.out.println("Theme of cloth : "+ this.theme);
        System.out.println("Size of cloth : "+this.size);
    }
    public static void main(String[] args) {
        Clothing c = new Clothing("shirt", 7, "formal", 30);
        c.details();
    }

    
}
