public class Author extends Book{
    
    String name;
    String thesis;
    int age;
    int books;


    Author(String name, int age, String bookName, int bookPages){
 
        super(bookName,bookPages);
        this.name = name;
        this.age = age;

    }

    public void setThesis (String topic){
        this.thesis = topic;
    }


    public void display(){
        System.out.println("-------------------------");
        System.out.printf("Title  : %s\n",this.title);
        System.out.printf("Pages  : %d\n", this.pages);
        System.out.printf("Author  : %s\n", this.name);
        System.out.print("-------------------------\n");

    }
    public static void main(String[] args) {
        Author kipling = new Author("Kipling", 101, "Thirukural", 200);
        kipling.display();
    }

}
