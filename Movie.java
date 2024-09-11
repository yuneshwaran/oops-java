
// 4.Define a Movie class with attributes title (String), director (String), and year (int). 
// Implement multiple constructors to initialize these attributes in different ways. 
// Create objects using each constructor and display their details.

public class Movie {

    String title;
    int year;

    //constuctors
    Movie(){
        this.title = "Null";
        this.year = 0000;
    }
    Movie(int year){
        this.year = 0;
    }
    Movie(String title , int year){
        this.title = title;
        this.year = year;
    }

    //getter and Setter
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    
    public static void main(String[] args) {
        
        Movie leo = new Movie();
        leo.setTitle("Leo");
        leo.setYear(2023);
        System.out.println(leo.getTitle());
        System.out.println(leo.getYear());


    }
}
