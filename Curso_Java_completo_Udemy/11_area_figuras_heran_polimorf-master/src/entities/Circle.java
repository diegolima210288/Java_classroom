package entities;

import entities.enums.Color;

//classe extens�o da super classe Shape (heran�a) 
public final class Circle extends Shape{
	
	//argumentos da pr�pria classe
	private double radius;
	
	//metodo padr�o
	public Circle () {
		super();
	}

	//metodo com argumentos
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	//metodos GETTERS e SETTERS
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//metodo generico da super classe, por�m com implementa��o desta classe (polimorfismo)
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
