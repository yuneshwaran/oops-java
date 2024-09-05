package oops;

//8.Create a class Laptop with attributes brand and price. Implement a method display_specs() 
//that prints the brand and price. Instantiate a Laptop object and call display_specs().

public class Laptop {
    
    String brand,model,processor;
    int ram,storage,year;
    double serialnum,price;


    
    //Constructors
    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public Laptop(String brand, String model, double serialnum, double price) {
        this.brand = brand;
        this.model = model;
        this.serialnum = serialnum;
        this.price = price;
    }
    public Laptop(String brand, String model, String processor, int ram, int storage, int year, double serialnum,
            double price) 
        {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.year = year;
        this.serialnum = serialnum;
        this.price = price;
    }
    //Getter Setter
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
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getSerialnum() {
        return serialnum;
    }
    public void setSerialnum(double serialnum) {
        this.serialnum = serialnum;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void display_specs(){
        System.out.println("Brand :"+ this.brand);
        System.out.println("Model :"+ this.model);
        System.out.println("Processor :"+ this.processor);
        System.out.println("Ram : "+this.ram+"GB");
        System.out.println("Storage :"+this.storage+"GBs");
        System.out.println("Price :"+ this.price);
        System.out.println("Year of release : "+ this.year);
        System.out.println("Serial num :"+ this.serialnum);

    }

    public static void main(String[] args) {
        
        Laptop lenovo = new Laptop("Lenovo", "Ideapad");
        lenovo.setProcessor("i5");
        lenovo.setPrice(30000);
        lenovo.setRam(4);
        lenovo.setYear(2018);
        lenovo.setStorage(500);
        lenovo.setSerialnum(298489236);
        lenovo.display_specs();

    }
}
