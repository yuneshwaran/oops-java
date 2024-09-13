
//10. Write a class Employee with attributes name and salary. Implement a method increase_salary()
// that takes a percentage and increases the salary accordingly. Create an instance and update the salary.

import java.time.temporal.TemporalAccessor;

public class Employee {

    private double salary;
    private String name;
    private final String desig;

    //constructors

    Employee(String name, String desig){
        this.name = name;
        this.desig = desig;
    }

    public void responsibility(){
        System.out.println("Not assigned yet");
    };
    //getter setter


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    //Display  details
    public void display(){
        System.out.println("Name :"+ this.name);
        System.out.println("Salary :"+ this.salary);
        System.out.println("Designation : "+ this.desig);
    }

    //increase sal
    public void salaryinc(int a){
        double tmp= (this.salary*a)/100; 
        this.salary += tmp;
    }


}

class Developer extends Employee{

    String team_name;
    Developer(String name){
        super(name,"Developer");
    }
    public void setTeam(String team_name){
        this.team_name = team_name;
    }

    public void display(){
        super.display();

        System.out.println("Team name :"+ this.team_name);
    }

}

class Designer extends Employee{

    String project;

    public Designer(String name,String project ){
        super(name,"Designer");
        this.project = project;
    }

    public void display(){
        super.display();

        System.out.println("Designing the "+ this.project);
    }

}


class Management{

    public static void main(String[] args) {
            Designer d = new Designer("prasanth","Advertisement");
            d.setSalary(60000);
            d.display();
    }
}
