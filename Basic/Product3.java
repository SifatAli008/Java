import java.util.Scanner;

public class Product3 {
    public static void main(String[] args){
        int id;
        String titel;
        float price;
        String description;
        String category;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter id Number: ");
        id = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        titel = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter a Price: ");
        price = input3.nextFloat();
        
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter a Description: ");
        description = input4.nextLine();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter a category: ");
        category = input5.nextLine();


        System.out.println("Id: " +id);
        System.out.println("Title: "+titel);
        System.out.printf("Print: %f",price);
        System.out.println("Description: "+description);
        System.out.println("Category: "+category);
    

    }
}
