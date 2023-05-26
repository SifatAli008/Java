package p3;

public class Student extends Person {

    double cgpa;

    Student(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    @Override
    void display() {
        System.out.println(" ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Cgepa : " + cgpa);
    }
    
}
