
//10. Write a class Employee with attributes name and salary. Implement a method increase_salary()
// that takes a percentage and increases the salary accordingly. Create an instance and update the salary.

public class Employee {

    double salary;
    String name;

    //constructors
    Employee(){
        this.name = "NULL";
        this.salary = 0;
    }
    Employee(String name, double sal){
        this.name = name;
        this.salary = sal;
    }

    //getter details
    public void display(){
        System.out.println("Name :"+ this.name);
        System.out.println("Salary :"+ this.salary);
    }

    //increase sal
    public void salaryinc(int a){
        double tmp= (this.salary*a)/100; 
        this.salary += tmp;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("YUKI",1000);
        e1.display();
        e1.salaryinc(10);
        e1.display();

    }
    
}
