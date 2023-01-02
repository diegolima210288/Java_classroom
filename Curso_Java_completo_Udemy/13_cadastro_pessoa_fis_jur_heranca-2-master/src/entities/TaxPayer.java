package entities;

//super classe abstrata, pois há um método abstrato, neste caso não podera ser instanciada
public abstract class TaxPayer {
	
	String name;
	double anualIncome;
	
	//método padrão
	public TaxPayer() {
		
	}

	//método com argumentos
	public TaxPayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//método GETTERS e SETTERS
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
	
	//método generico, para calcular o valor do imposto
	public abstract double tax();

}
