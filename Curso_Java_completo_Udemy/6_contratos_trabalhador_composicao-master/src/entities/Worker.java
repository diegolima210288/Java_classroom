package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department;
	private List<HourContract> list = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getList() {
		return list;
	}

	public void setList(List<HourContract> list) {
		this.list = list;
	}

	//metodo para adicionar contratos para o trabalhado
	public void addContract(HourContract contract) {
		list.add(contract);
	}
	
	//metodo para remover contrados do trabalhado
	public void removeContract(HourContract contract) {
		list.remove(contract);
	}
	
	//metodo para apresentar a renda total do trabalhador (salario base + contratos realizados no mes/ano informado)
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract obj : list) {
			cal.setTime(obj.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += obj.totalValue();
			}
		}
		
		return sum;
	}

}
