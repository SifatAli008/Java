public  class Student {
    int id;
    String name;
    double cgpa;

    Student(int a,String b,double d){
        id =a;
        name = b;
        cgpa = d;
    }

    Student(int m,String n){
        id =m;
        name = n;

        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Not Updated yet!");
        System.out.println("");
        
    }

    // void setinfo(int a,String b,double d){
    //      id =a;
    //     name = b;
    //     cgpa = d;
    // }

    void display(){
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student cgpa: " + cgpa);
        System.out.println("");
    }
}
