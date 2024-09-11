public class PostGraduate extends GradStudent{

    String university;
    String pgDegree;

    PostGraduate(int id,String name, int gradYear,String thesis,String university,String pgDegree)
    {
        super(id,name,gradYear,thesis);
        this.university = university;
        this.pgDegree = pgDegree;

    }

    

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }



    public String getPgDegree() {
        return pgDegree;
    }
    public void setPgDegree(String pgDegree) {
        this.pgDegree = pgDegree;
    }



    public void display(){
        System.out.println("Student name :"+name);
        System.out.println("Student id: "+id);
        System.out.println("Graduated on :"+ gradYear);
        System.out.println("Thesis toopic :"+thesis);
        System.out.println("University : "+ university);
        System.out.println("Pg degree on :"+pgDegree);
    }



}
