/*6.a) Define a base class Media with a method play(). Create two subclasses Music and Video that both extend Media and 
override the play() method. In the main method, create instances of Music and Video and call their play() methods.
b)Define a class Media with a method play(). Create a class Audio that extends Media and provides a specific implementation
of play(). Then, create a class Podcast that extends Audio and adds a method subscribe(). Write a main method to create an 
instance of Podcast and call play() and subscribe(). */



public class Media {

    int fileSize;

    Media(int fileSize){

        this.fileSize = fileSize;
        System.out.println("Media Object Created");
    }

    public void play(){
        System.out.println("Media is playing");
    }
}

class Audio extends Media{

    String encoding;

    Audio(int fileSize,String encoding){
        super(fileSize);
        this.encoding = encoding;
    }

}

class Music extends Audio{
    
    String artist;

    Music(int fileSize,String artist){
        super(fileSize,"mp3");
        this.artist = artist;
    }

    public void play(){

        System.out.println("Music by " + this.artist + " is playing");

    }



}
class Video extends Media{

    String movieName;

    Video(int fileSize,String movieName){
        super(fileSize);
        this.movieName = movieName;
    }

}

class Podcast extends Audio{
    
    int duration;

    Podcast(int fileSize,int duration){
        super(fileSize,"mp3");
        this.duration = duration;
    }

    public void play(){
        System.out.println("Podcast started playing");
    }
}