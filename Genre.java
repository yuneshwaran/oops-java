public class Genre extends Book{
    
    String genre;

    Genre(String title,int pages,String genre ){
        super(title,pages);
        this.genre = genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void display(){
        System.out.println("-------------------------");
        System.out.printf("Title  : %s\n",title);
        System.out.printf("Pages  : %d\n",pages);
        System.out.printf("Genre  : %s\n",genre);
        System.out.print("-------------------------\n");

    }

    

}
