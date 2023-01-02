package entitites;

public class Product {
	
	String name;
	Double price;
	
	//metodo padrão
	public Product() {
		
	}

	//metodo com argumentos
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//metodos GETTERS e SETTERS (para permitir consultar ou alterar o dado de cada argumento)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//metodo para apresentar os dados do arguemento (etiqueta do produto)
	public String priceTag() {
		return getName()
				+" $ "
				+getPrice();
	}
	
}
