import java.util.ArrayList;

public class P3 {
    public static void main(String[] args) {
        ArrayList <Integer> Number =new  ArrayList <Integer>();

        Number.add(10);
        Number.add(20);
        Number.add(40);
        Number.add(30);
        Number.add(40);

        //befor set
        System.out.println(Number);

        boolean Contain = Number.contains(30);
        System.out.println("30 is in the list : "+Contain);

        Number postion = Number.indexOf(40);
        System.out.println("The index of 40 is : "+postion);

        //after set
        Number.set(1,60);
        System.out.println(Number);

        int x = Number.get(0);
        System.out.println("Index 0 : "+x);    


    }


}
