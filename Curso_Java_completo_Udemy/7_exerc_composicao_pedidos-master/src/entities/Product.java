package entities;

public class Product {
	
	//atributos da classe
	private String name;
	private double price;
	
	//metodo padrão
	public Product() {
		
	}

	//metodo com os atributos
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//metodos GETTERS e SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
