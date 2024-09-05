package oops;

// 3.Define a class Book with attributes title (String), author (String), 
// and pages (int). Provide methods to set and get these attributes. Also, include a method 
// displayInfo that prints out the book's details.


public class Book{

    String title,author;
    int pages, rating;


    //constructors
    Book(){
        this.title = "Null";
        this.author = "Null";
        this.pages = 0;

    }


    Book(String author, String title,int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayBook(){
        System.out.println("-------------------------");
        System.out.printf("Title  : %s\n",this.title);
        System.out.printf("Author : %s\n",this.author);
        System.out.printf("Pages  : %d\n", this.pages);
        System.out.print("-------------------------\n");

    }

    //Getters and Setters

    public String getTitle(){ 
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){ 
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getPages(){ 
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
   
    public static void main(String[] args){

        Book b1 = new Book();
        b1.setAuthor("JK Rowling");
        b1.setTitle("Harry Potter");
        b1.setPages(200);

        Book b2 = new Book("Franz Kafka", "Metamorphosis",200);

        b1.displayBook();
        b2.displayBook();

    }

}

