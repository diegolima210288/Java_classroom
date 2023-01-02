package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		//le os dados da conta
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Balance: ");
		Double balance = sc.nextDouble();

		BusinessAccount account = new BusinessAccount(number, holder, balance, 0.0);
		
		//apresenta os dados da conta
		System.out.println();
		System.out.println("Number: " + account.getNumber());
		System.out.println("Holder: " + account.getHolder());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Loan Limit: " + account.getLoanLimit());
		
		//enter com o valor do limite
		System.out.println();
		System.out.print("Enter value LoanLimit: ");
		Double loanLimit = sc.nextDouble();
		
		//enter com o valor de emprestimo
		System.out.println();
		System.out.print("Enter value loan: ");
		Double loan = sc.nextDouble();
		
		account.setLoanLimit(loanLimit);
		
		account.loan(loan);
		
		//apresenta o valor do novo saldo
		System.out.println();
		System.out.println("New Balance: " + account.getBalance());
		*/
		
		Account acc1 = new Account(123, "Diego", 8000.00);
		acc1.withdraw(2000.00);
		System.out.println("Number: " + acc1.getNumber());
		System.out.println("Holder: " + acc1.getHolder());
		System.out.println("Balance: " + acc1.getBalance());
		
		System.out.println("-------------------------------------");
		BusinessAccount acc2 = new BusinessAccount(124, "Guga", 4000.00, 1000.00);
		acc2.withdraw(3000.00);
		System.out.println("Number: " + acc2.getNumber());
		System.out.println("Holder: " + acc2.getHolder());
		System.out.println("Balance: " + acc2.getBalance());
		acc2.loan(500.00); //solicitação de emprestimo (menor que o limite)
		System.out.println("New balance: " + acc2.getBalance());
		
		System.out.println("--------------------------------------");
		SavingsAccount acc3 = new SavingsAccount(125, "Marcão", 2000.00, 1.00);
		acc3.withdraw(500.00);
		System.out.println("Number: " + acc3.getNumber());
		System.out.println("Holder: " + acc3.getHolder());
		System.out.println("Balance: " + acc3.getBalance());
		acc3.updateBalance(); //aplica juros sobre o saldo
		System.out.println("New Balance: " + acc3.getBalance());
		
		System.out.println("--------------------------------------");
		
		//exemplo de polimorfismo (varivel de um tipo sendo instanciada com outro tipo)
		Account acc4 = new Account(126, "Bruno", 3000.00);
		acc4.withdraw(2000.00);
		System.out.println("New Balance simple account: " + acc4.getBalance());
		
		Account acc5 = new BusinessAccount(127, "Viviane", 3000.00, 0.00);
		acc5.withdraw(1000.00);
		System.out.println("New Balance simple account: " + acc5.getBalance());

	}

}
