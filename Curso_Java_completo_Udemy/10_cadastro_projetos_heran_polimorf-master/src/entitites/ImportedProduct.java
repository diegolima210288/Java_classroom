package entitites;

//esta sub classe n�o ser� utilizada para ser superclasse, por este motivo o uso do comando "final"
public final class ImportedProduct extends Product{
	
	public Double customsFee;
	
	//private Product product = new Product();
	
	//metodo padr�o
	public ImportedProduct() {
		super();
	}

	//metodo com argumentos
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	//metodos GETTERS e SETTERS
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	//Polimorfismos: utiliza��o do m�todo generico da superclasse e adicionando mais informa��es
	@Override
	public String priceTag() {
		//super.priceTag();		
		return getName() //n�o � necess�rio indicar que � da classe principal
				+" $ "
				+totalPrice()  //n�o � necess�rio indicar que � da classe principal
				+" (Customs fee: $ "
				+customsFee
				+")";
	}
	
	//metodo para apresentar o pre�o total do produto importado
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	

}
