package entities;

//super classe abstrata, pois h� um m�todo abstrato, neste caso n�o podera ser instanciada
public abstract class TaxPayer {
	
	String name;
	double anualIncome;
	
	//m�todo padr�o
	public TaxPayer() {
		
	}

	//m�todo com argumentos
	public TaxPayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//m�todo GETTERS e SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//m�todo generico, para calcular o valor do imposto
	public abstract double tax();

}
