import java.util.Scanner;

public class Assingment4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int phonePrice = 1800;
        int numberOfInstallment, installmentPerMonth;

        System.out.println("Number of Installment?");
        numberOfInstallment = input.nextInt();

        installmentPerMonth = phonePrice / numberOfInstallment;
        System.out.print("Installment Per Month: " +installmentPerMonth);
    }
}
