package entitites;

//esta sub classe não será utilizada para ser superclasse, por este motivo o uso do comando "final"
public final class ImportedProduct extends Product{
	
	public Double customsFee;
	
	//private Product product = new Product();
	
	//metodo padrão
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
	
	//Polimorfismos: utilização do método generico da superclasse e adicionando mais informações
	@Override
	public String priceTag() {
		//super.priceTag();		
		return getName() //não é necessário indicar que é da classe principal
				+" $ "
				+totalPrice()  //não é necessário indicar que é da classe principal
				+" (Customs fee: $ "
				+customsFee
				+")";
	}
	
	//metodo para apresentar o preço total do produto importado
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	

}
