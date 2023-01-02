package entities;

public class Company extends TaxPayer{
	
	public int numberOfEmployees;
	
	//m�todo padr�o
	public Company() {
		super();
	}

	//m�todo com argumentos
	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	//m�todos GETTERS e SETTERS
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	//m�todo da super classe, com implementa��o do calculo de imposto de pessoa jur�dica (company)
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
