package testemployee;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
        int choice = -1;
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<Employee>();

        do {

            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("0.Exit");
            System.out.print("Enter Your Choice : ");
            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter how many Employees you want ; ");
                    int n = in.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter Employee id: ");
                        int id = in.nextInt();

                        System.out.print("Enter Employee Name: ");
                        String name = in.next();

                        System.out.print("Enter Employee Salary: ");
                        double salary = in.nextDouble();

                        al.add(new Employee(id, name, salary));
                    }
                    break;
                }
                
                
                case 2: {
                    System.out.println(al);
                    break;
                }

            }

        } while (choice != 0);
    }

}
