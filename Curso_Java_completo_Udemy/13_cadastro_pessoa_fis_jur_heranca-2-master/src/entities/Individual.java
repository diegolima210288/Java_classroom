package entities;

public class Individual extends TaxPayer{
	
	public double healthExpenditures;
	
	//m�todo padr�o
	public Individual() {
		super();
	}

	//m�todo com argumentos
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	//m�todos GETTERS e SETTERS
	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	//m�todo da super classe, com implementa��o do calculo de imposto de pessoa f�sica (individual)
	@Override
	public double tax() {
		double val = 0.0;
		if (anualIncome <= 2000.00) {
			if (healthExpenditures > 0) {
				val = (anualIncome * 0.15) - (healthExpenditures * 0.5);
			} else if (healthExpenditures == 0) {
				val = (anualIncome * 0.15);
			}
		}else if (anualIncome > 2000.00) {
			if (healthExpenditures > 0) {
				val = (anualIncome * 0.25) - (healthExpenditures * 0.5);
			} else if (healthExpenditures == 0) {
				val = (anualIncome * 0.25);
			}
		}
		return val;
	}

}
