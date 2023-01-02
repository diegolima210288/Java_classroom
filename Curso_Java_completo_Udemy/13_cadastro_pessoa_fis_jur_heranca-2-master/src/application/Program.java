package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
/*==========================================================
 * aplicação para leitura de dados de N contribuintes (fornecido pelo usuário),
 * os quais podem ser pessoa física ou jurídica, e depois apresenta o imposto
 * que cada um pagou e o total.
 * =======================================================
 * pessoa física: paga imposto de 15%, se a renda anual for menor ou igual a 20000.00
 * senão paga 25% de imposto.
 * -------------------------------------------------------
 * pessoa jurídica: paga imposto de 16%, se a empresa possuir menos de 10 funcionarios
 * senão paga 14% de imposto.
 ==========================================================*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				taxPayer.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (type == 'c') {
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxPayer.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer obj : taxPayer) {
			System.out.println(obj.tax());
		}
		
		double sum = 0.0;
		
		for (TaxPayer obj : taxPayer) {
			sum += obj.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: "+sum);
		
		sc.close();

	}

}
