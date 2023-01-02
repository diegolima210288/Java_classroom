package entities;

public class Company extends TaxPayer{
	
	public int numberOfEmployees;
	
	//método padrão
	public Company() {
		super();
	}

	//método com argumentos
	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	//métodos GETTERS e SETTERS
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	//método da super classe, com implementação do calculo de imposto de pessoa jurídica (company)
	@Override
	public double tax() {
		double val = 0.0;
		if (numberOfEmployees > 10) {
			val = anualIncome * 0.14;
		} else if (numberOfEmployees < 10) {
			val = anualIncome * 0.16;
		}
		return val;
	}

}
