package entities;

import entities.enums.Color;

//classe extens�o da super classe Shape (heran�a) 
public class Rectangle extends Shape{
	
	//argumentos da pr�pria classe
	private double width;
	private double height;
	
	//metodo padr�o
	public Rectangle () {
		super();
	}

	//metodo com argumentos
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	//metodos GETTERS e SETTERS
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//metodo generico da super classe, por�m com implementa��o desta classe (polimorfismo)
	@Override
	public double area() {
		return width * height;
	}

}
