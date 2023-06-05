import java.util.ArrayList;
import java.util.Iterator;


class p1 {

    public static void main(String[] args) {

        ArrayList <Integer> number = new ArrayList<Integer>();
 
        // adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(2, 40);

        // Iterator itr = number.iterator();
        // while(itr.hasNext()){
        //     System.out.println(" "+itr.next());
        // }
        
        System.out.println(number);        

        // for ( int x :number) {
        //     System.out.print(x+" ");    
        // }

        // System.out.println(number);

        System.out.println("size = " + number.size());
        System.out.println();

        //Removeing element
       number.remove(1);
       System.out.println(number);
       System.out.println("size = " + number.size());
  
    }
}