// 5. Define a class Building with a method construct(). Create a class House that extends Building and 
// adds a method decorate(). Then, create a class Villa that extends House and adds a method luxuryFeatures(). 
// Write a main method to create an instance of Villa and demonstrate calling construct(), decorate(), and luxuryFeatures().

public class Building {

    String name;
    Building(String name){
        this.name = name;
    }

    public void construct(){
        System.out.println("In construction");
    }
}

//child 1
class House extends Building{

    String decoration;

    House(String name, String decoration){
        super(name);
        this.decoration = decoration;
    }

    public void decorate(){

        System.out.println("Decorated Home with "+this.decoration);

    }
}

//child 2
class Villa extends Building{

    String feature;

    Villa(String name, String feature){
        super(name);
        this.feature = feature;
        
    }

    public void luxuryFeatures(){

        System.out.println("Luxury building has feature :"+this.feature);

    }

    public static void main(String[] args) {
        
        Villa v = new Villa("Guest house", "smart lock");
        v.luxuryFeatures();

        House h = new House("Main House", "Christmans Tree");
        h.decorate();
    }
}
