public class FormerEmp extends Employee {


    int leave;
    String title;

    FormerEmp(int leave,String title){
        super();
        this.leave= leave;
        this.title = title;

    }

    public void display(){
        System.out.println("Former employee");
        System.out.println("Left Company on  : "+ this.leave);
        System.out.println("Left on Title : "+ this.title);
    }
    
}
