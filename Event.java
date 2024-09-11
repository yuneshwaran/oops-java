//7. Define a class Event with a method schedule(). Create a class Conference that extends Event and adds a method 
//arrangeSpeakers(). Then, create a class Workshop that extends Conference and includes a method prepareMaterials(). 
//Write a main method to instantiate a Workshop object and call schedule(), arrangeSpeakers(), and prepareMaterials().

public class Event {

    String date;
    String title;

    Event(String title){

        this.title = title;

    }

    public void schedule(String date){
        this.date = date;
        System.out.println("Event scheduled on :"+ date);
    }
}

class Conference extends Event{


    String venue;
    Conference(String title,String venue){

        super(title);
        this.venue = venue;
    }

    public void arrangeSpeakers(){
        System.out.println("Speakers are arranged");
    }
}

class Workshop extends Conference{

    String theme;
    Workshop(String title,String venue,String theme){
        super(title,venue);
        this.theme = theme;
    }

    public void prepareMaterials(){
        System.out.println("Materials prepared");
        System.out.println("Workshop preparations done");
    }

    public static void main(String[] args) {
        Workshop w = new Workshop("new Workshop", "Conference hall", "AI");
        w.arrangeSpeakers();
        w.prepareMaterials();
    }
}



