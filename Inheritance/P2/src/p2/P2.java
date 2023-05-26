package p2;

public class P2 {

    public static void main(String[] args) {
        Person p1 = new Person();//base,super
        Cat c = new Cat();
        Teacher t1 = new Teacher(); //child
        t1.setName("Sifat Ali");
        t1.setAge(21);
        t1.setQualification("Msc Cse");
        System.out.println(t1.getName() + "\n" + t1.getAge() + "\n" + t1.getQualification());
        System.out.println(" ");

        Teacher t2 = new Teacher();
        t2.setName("Halum ");
        t2.setAge(22);
        t2.setQualification("Msc Cse");
        System.out.println(t2.getName() + "\n" + t2.getAge() + "\n" + t2.getQualification());
        System.out.println(" ");
        
        System.out.println(t1 instanceof Person);//teacher is object of person , teaher inharit teacher 
         
    }
}
