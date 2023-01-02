package entitites;

import java.util.Date;

public final class UsedProduct extends Product{
	
	private Date manufactureDate;
	
	//private Product product = new Product();
	
	//metodo padrão
	public UsedProduct() {
		super();
	}

	//metodo com argumentos
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//metodos GETTERS e SETTERS
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	//Polimorfismos: utilização do método generico da superclasse e adicionando mais informações
	@Override
	public String priceTag() {
		//super.priceTag();
		return getName()  //não é necessário indicar que é da classe principal
				+" $ "
				+getPrice() //não é necessário indicar que é da classe principal
				+" (Manufacture date: "
				+manufactureDate
				+")";
	}

}
