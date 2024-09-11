
public class Person {
    
    String name;
    int age;

    Person(){
        this.name = "Null";
        this.age = 0;
    }

    Person(String name){
        this.name = name;
    }

    Person(int age){
        this.age = age;
    }

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.printf("Hello there %s\n",this.name);
    }


    public static void main(String[] args) {
        Person Reacher = new Person();
        Reacher.greet();
        Reacher.name = "Reacher";
        Reacher.greet();
    }
}
