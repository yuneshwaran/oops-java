
// 3.Define a class Book with attributes title (String), author (String), 
// and pages (int). Provide methods to set and get these attributes. Also, include a method 
// displayInfo that prints out the book's details.


public class Book{

    String title;
    int pages, rating;


    //constructors
    Book(){
        this.title = "Null";
        this.pages = 0;

    }


    Book(String title,int pages){
        this.title = title;
        this.pages = pages;
    }


    public void display(){
        System.out.println("-------------------------");
        System.out.printf("Title  : %s\n",this.title);
        System.out.printf("Pages  : %d\n", this.pages);
        System.out.print("-------------------------\n");

    }

    //Getters and Setters

     String getTitle(){ 
        return this.title;
    }
     void setTitle(String title){
        this.title = title;
    }

     int getPages(){ 
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
   
    public static void main(String[] args) {
        Book b1 = new Book();
       
        b1.getTitle();

        b1.setTitle("Hello");
        b1.title = "fjsoihoi";
    }


}

