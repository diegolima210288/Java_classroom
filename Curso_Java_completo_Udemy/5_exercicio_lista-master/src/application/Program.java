package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/*=======================================================================
		 * este programa adiona le a quantidade de funcionarios, adiciona os dados (id, nome e salary)
		 * em uma lista (classe Employee), acrescenta uma porcentagem sobre o salario do funcionário
		 * selecionado e apresenta na tela todos os dados da lista
		 =========================================================================*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//declaração lista employee e instanciando como Array List
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		//lendo os dados dos funcionarios
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #"+1+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			//adicionando os dados na lista
			employee.add(new Employee(id, name, salary));
		}
		
		//acrescentando porcentagem no salario do funcionário
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		Employee emp = employee.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		emp.increaseSalary(percentage);
		
		//apresentado os dados da lista
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : employee) {
			System.out.println(obj);
		}
		
		sc.close();
 
	}

}
