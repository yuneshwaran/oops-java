import java.util.Scanner;

abstract class Activity{

    int hours;
    public abstract void calculate_calories_burned(int hours);

}

class Swimming extends Activity {


    public void calculate_calories_burned(int hours) {
        int tmp = hours*500;
        System.out.println("Calories Burned by Swimming : "+tmp);
    }
}

class Running extends Activity {



    public void calculate_calories_burned(int hours) {
        int tmp = hours*700;
        System.out.println("Calories Burned by Running : "+ tmp);
    }
}

class Cycling extends Activity {


    public void calculate_calories_burned(int hours) {
        int tmp = hours*300;
        System.out.println("Calories Burned by Cycling : "+tmp);
    }
}

class Tracker{
    int time[] = new int[3];
    String[] activity = {"Running","Swimming","Cycling"};

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
       int i = 0;
        while(i<3) {
            System.out.print("Time spent " + activity[i] + " in Hrs : ");
            time[i] = sc.nextInt();
            //System.out.println();
            i++;
        }
    }
    public void calcuate(){

        Running r = new Running();
        r.calculate_calories_burned(time[0]);

        Swimming s = new Swimming();
        s.calculate_calories_burned(time[1]);

        Cycling c = new Cycling();
        c.calculate_calories_burned(time[2]);


    }


}

class main{
    public static void main(String[] args) {

    Tracker tr = new Tracker();
    tr.getDetails();
    tr.calcuate();

    }
}




