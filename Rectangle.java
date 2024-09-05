package oops;

//6.Define a class Rectangle with attributes width and height. Add a method area() 
//that returns the area of the rectangle. Create an instance and call the area() method.

public class Rectangle{

    int length, 
        breadth,
        area,
        perimeter;

    Rectangle(){
        this.length = 0;
        this.breadth = 0;
        this.area = 0;
        this.perimeter = 0;
    }
    Rectangle(int l , int b){
        this.length = l;
        this.breadth = b;
        this.area = 0;
        this.perimeter = 0;
    }

    public void perimeter(){
        this.perimeter = 2*(this.length + this.breadth);
        System.out.println("Area : "+ this.perimeter);
    }

    public void area(){
        this.area = this.length * this.breadth;
        System.out.println("Area : "+ this.area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        r1.area();
        r1.perimeter();
    }
}