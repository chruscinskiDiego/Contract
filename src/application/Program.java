package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Between contract data: ");
        System.out.print("Number:");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments: ");
        int numberOfInstallments = sc.nextInt();


        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj,numberOfInstallments);

        System.out.println("Installments: ");

        for(Installment installment : obj.getInstallments())
        {
            System.out.println(installment);
        }

        sc.close();

    }
}
