
public abstract class Product {

    String name;
    int price;
    int tax;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public abstract void details();

    public abstract void calculate_price(int quantity);
}

class Digital_Product extends Product{


    Digital_Product(String name, int price){
        super(name,price);
        this.tax = 10;
    }
    public  void details(){

        System.out.println("Product name : "+this.name);
        System.out.println("Type : Digital Product");
        System.out.println("Product cost : "+ this.price);

    }

    public  void calculate_price(int a){


        int tmp = price + ((price*tax)/100);
        System.out.println("Digital product can be bought only once");
        System.out.println("Product total cost (Incl. Tax) : "+ tmp );

    }

}

class Physical_Product extends Product{




    Physical_Product(String name, int price){
        super(name,price);
        this.tax = 10;

    }

    public  void details(){

        System.out.println("---------------------------------");
        System.out.println("Product name : "+this.name);
        System.out.println("Type : Physical Product");
        System.out.println("Product cost (Incl. Tax)  : "+ this.price);
       // System.out.println("---------------------------------");

    }

    public  void calculate_price(int quantity ){

        int tax = 15;
        System.out.println("---------------------------------");
        int tl_price = price + ((price*tax)/100);
        tl_price *= quantity;

        System.out.println("Product total cost (Incl. Tax) : " + tl_price );

    }

}

class cart {
    public static void main(String[] args) {
        

        Digital_Product Spotify = new Digital_Product("Spotify License", 200);
        Spotify.calculate_price(1);
        Spotify.details();

        Physical_Product stick = new Physical_Product("Assault Rifle", 400);
        stick.calculate_price(20);
        stick.details();

    }
}

