package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		/*====================================================
		 * ----Programa de cadastro de funcionarios prórios e 
		 * --------------tercerizados de uma empresa.
		 * ---------------------------------------------------
		 * ----Utilização da técnica de Herança: classe OutsourceEmployee
		 * --é uma subclasse da classe Employee.
		 * ---------------------------------------------------
		 * -----Também utilização técnica de Polimorfismo: método "payment"
		 * --da subclasse OutsourceEmployee é um metodo genérico da 
		 * --superclasse Employee.
		 ====================================================*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		//coleta dos dados dos funcionarios
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			//se o funcionario não for tercerizado valor do argumento additionalCharge será 0.
			if (type == 'y') {
				
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			} else {
				
				employee.add(new Employee(name, hours, valuePerHour));
				
			}
			
		}
		
		//apresentação dos dados da lista
		System.out.println();
		System.out.println("PAYMENTS: ");
		//utilização laço for simples onde a varivel "obj" recebe os dados da lista
		for (Employee obj : employee) {
			System.out.println(obj.getName()+" - $ "+obj.payment());
		}
		
		
		sc.close();

	}

}
