//4. Define a class Institution with a method operate(). Create a class College that extends Institution and adds a method
// conductClasses(). Then, create a class Department that extends College and adds a method manageCourses(). Write a main 
//method to create an instance of Department and call all methods (operate(), conductClasses(), manageCourses()).

public class Institution {

    boolean isOperating;

    Institution(){
        this.isOperating = true;
    }

    public void operate(){

        System.out.println("Institution is in operation");
        isOperating = true;

    }
    public void close(){

        System.out.println("Institution is Closing");
        isOperating = false;

    }
    
}

class College extends Institution{

    String collegeName;

     College(String collegeName){
        super();
        this.collegeName = collegeName;
     }
    public void conductClasses(){
        System.out.println("Class is in session");
    }

}

class Department extends College{

    String courseName;
    int courseId;

    Department(String collegeName,String courseName, int courseId){

        super(collegeName);
        this.courseId = courseId;
        this.courseName = courseName;

    }

    public void manageCourses(){

        System.out.println("Course name : "+courseName);
        System.out.println("Course Id : "+courseId);

    }
    public static void main(String[] args) {
        Department d = new Department("MIT", "CSE", 101);
        d.operate();
        d.close();
        d.conductClasses();
        d.manageCourses();

        College c = new College("SRM");
        c.conductClasses();


    }

}