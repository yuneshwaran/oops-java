package oops;

// 2.Create a Student class with the attributes:name (String),id (int),grades (an array of double)
// Methods:
// A constructor to initialize name, id, and grades.
// addGrade(double grade) - Adds a grade to the grades array.

public class Student {

    String name;
    int id;
    int i = 0;
    double[] grades = new double[5];

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public double[] getGrades(){
        return this.grades;
    }

    public void setGrades(double grade){
        if(i<5){
            this.grades[i] = grade;
            i++;
        }
        
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Raven");
        s1.setGrades(90);
        s1.setGrades(80);
        s1.setGrades(83);
        s1.setGrades(45);
        s1.setGrades(45);

        double [] grades = s1.getGrades();

        for(double i : grades){
            System.out.print(i+" ");
        }
    }
}
