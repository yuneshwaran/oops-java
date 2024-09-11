public class TenureEmp extends Employee {

    int experience;
    String dept;

    TenureEmp(int experience,String dept){
        super();
        this.dept= dept;
        this.experience = experience;

    }

    public void display(){
        System.out.println("Tenure employee");
        System.out.println("Experience : "+ this.experience);
        System.out.println("Department : "+ this.dept);
    }
    
}
