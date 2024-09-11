public class GradStudent extends Student{

    int gradYear;
    String thesis;


    GradStudent(int id, String name,int gradYear,String thesis){
        
        super(id,name);
        this.gradYear = gradYear;
        this.thesis = thesis;
    }

    public void display(){
        System.out.println("Student name :"+name);
        System.out.println("Student id: "+id);
        System.out.println("Graduated on :"+ gradYear);
        System.out.println("Thesis toopic :"+thesis);
    }

    public static void main(String[] args) {
        GradStudent g1 = new GradStudent(200, "Wayne", 2009, "AC/DC");
        g1.display();
        Student s1 = new Student(20,"Yunesh");
        s1.display();
    }
}
