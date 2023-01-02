package entities;

public class OrderItem {
	
	//atributos
	private Integer quantity;
	private Double price;
	
	//atributo de composição
	private Product product;
	
	//metodo padrão
	public OrderItem() {
		
	}

	//metodo com argumentos
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}


	//metodos GETTERS e SETTERS
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	//metodo para retonar o subtotal
	public double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+", $"
				+String.format("%.2f", price)
				+", Quantity: "
				+quantity
				+", Subtotal: $"
				+String.format("%.2f", subTotal());
	}
	

}
