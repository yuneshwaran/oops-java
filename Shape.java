public class Shape {

    String name;
    Shape(){
    }
    Shape(String name){

        System.out.println("A Shape is Created");
        this.name = name;
    }
}

class twoDshape extends Shape {
    int length, breadth;

    twoDshape(String name){
        super(name);
    }

    public void area(){
        System.out.println("Area of Square :"+ (length*breadth) );
    }

    public static void main(String[] args) {
        Square s = new Square("square", 10);
        s.area();
    }
}

class Square extends twoDshape{

    int area ;
    int length;

    Square(String name,int length){

        super(name);
        System.out.println("Square Obj Created");
        this.length = length;
        
    }
    
    public void area(){
       System.out.println("Area of Square :"+ (length*length) );
    }
}

//three d shape
class threeDshape extends Shape {
 
    int length,breadth,width;

    threeDshape(String name,int length,int breadth,int width){
        super(name);
        this.breadth = breadth;
        this.length = length;
        this.width = width;
    }
}

class Cube extends threeDshape{

    double volume;
    
        Cube(String name,int length,int breadth,int width){
    
            super(name,length,breadth,width);
       
        }
    
        public void volume(){
            this.volume = (this.length*this.breadth)*this.width;
            System.out.println("Volume of Cube is :"+ this.volume );
        }
    
        
    }
    



