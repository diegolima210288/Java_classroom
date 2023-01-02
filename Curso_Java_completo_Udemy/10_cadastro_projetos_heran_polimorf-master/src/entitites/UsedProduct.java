package entitites;

import java.util.Date;

public final class UsedProduct extends Product{
	
	private Date manufactureDate;
	
	//private Product product = new Product();
	
	//metodo padr�o
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
	
	//Polimorfismos: utiliza��o do m�todo generico da superclasse e adicionando mais informa��es
	@Override
	public String priceTag() {
		//super.priceTag();
		return getName()  //n�o � necess�rio indicar que � da classe principal
				+" $ "
				+getPrice() //n�o � necess�rio indicar que � da classe principal
				+" (Manufacture date: "
				+manufactureDate
				+")";
	}

}
