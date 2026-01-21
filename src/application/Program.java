package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer number = in.nextInt();
		in.nextLine();
		
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(in.nextLine(), fmt);
		
		
		System.out.print("Contract value: ");
		Double totalValue =  in.nextDouble();
		
		System.out.print("Enter the number of installments: ");
		Integer months =  in.nextInt(); 
		
		Contract contract = new Contract(number, date, totalValue);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);
		
		System.out.println("Parcelas: ");
		for (Installment installments : contract.getInstallments()) {
			System.out.println(installments);
		}
		
		in.close();
		
	}
}
