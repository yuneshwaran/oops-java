
import java.util.Arrays;
import java.util.Scanner;


public class reportCard{

    String name;

    String[] sub = {"MATHS",
                    "ENGLISH",
                    "SCIENCE", 
                    "SOCIAL"};
    int[] marks = new int [4];

    char grade;
    //constructor
    reportCard( String name){
        this.name = name;
        this.grade = 'N';
    }

    public void printer(){
        System.out.println("\n--------------------------");
        System.out.print("--------Report Card-------\n");
        System.out.println("--------------------------");
        System.out.printf("Student Name : %s \n",name);
        System.out.printf("%s----  %d\n",sub[0],marks[0]);
        System.out.printf("%s--- %d\n",sub[1],marks[1]);
        System.out.printf("%s--- %d\n",sub[2],marks[2]);
        System.out.printf("%s---  %d\n",sub[3],marks[3]);
        System.out.println("--------------------------");
        System.out.printf("%s----  %d\n","TOTAL",Arrays.stream(marks).sum());
        System.out.println("--------------------------");
    
    }
    public void getMarks(){
        int i=0;
        Scanner sc = new Scanner(System.in);
        while (i<=3){
            System.out.printf("Enter marks for %s :",sub[i]);
            marks[i] = sc.nextInt();
            i++;
        }
        sc.close();
    }

    //Driver method
    public static void main(String[] args) {
        
        reportCard r1 = new reportCard("Kumar");

        r1.getMarks();
        for (int i=0;i<4;i++){
              System.out.print(r1.marks[i]+" ");
          }
        r1.printer();
    }
}