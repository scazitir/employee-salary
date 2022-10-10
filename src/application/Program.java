package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = scan.nextLine();
        System.out.print("Gross Pay: $ ");
        emp.grossPay = scan.nextDouble();
        System.out.print("Tax: ");
        emp.tax = scan.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Enter the percentage to increase the employee salary: ");
        emp.increaseSalary(scan.nextDouble());

        System.out.println();
        System.out.println("Final salary: " + emp);

        scan.close();
    }
}
