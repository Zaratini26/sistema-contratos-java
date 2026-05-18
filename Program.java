package ProjectContracts;

import ProjectContracts.entitites.Department;
import ProjectContracts.entitites.HourContract;
import ProjectContracts.entitites.Worker;
import ProjectContracts.entitites.enums.WorkerLevel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the department name: ");
        String nameDepartment = sc.nextLine();
        Department department = new Department(nameDepartment);

        System.out.println("Enter the worker data: ");

        System.out.print("Name: ");
        String nameWorker = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel levelWorker = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(nameWorker, levelWorker, baseSalary, department);

        System.out.print("How many contracts this worker have: ");
        int contractsNumber = sc.nextInt();

        for (int i = 0; i < contractsNumber; i++) {
            System.out.printf("Enter the #%d contract data:%n", i+1);

            System.out.print("Date (dd/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), sdf);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Hours: ");
            int contractHours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, contractHours);
            worker.addContract(contract);
        }

        System.out.print("Enter the year and month to calculate the income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": $" + String.format("%.2f", worker.income(year, month)));

    }
}
