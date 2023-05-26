package p3;

public class Teacher extends Person {

    String qualification;

      Teacher(String name,int age,String qualification){
        this.name=name;
        this.age=age;
        this.qualification=qualification;
    }
    @Override
    void display() {
        System.out.println(" ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Qualification : " + qualification);
    }
}
