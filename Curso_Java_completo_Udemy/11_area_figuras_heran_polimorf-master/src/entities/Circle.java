package entities;

import entities.enums.Color;

//classe extensão da super classe Shape (herança) 
public final class Circle extends Shape{
	
	//argumentos da própria classe
	private double radius;
	
	//metodo padrão
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
	
	//metodo generico da super classe, porém com implementação desta classe (polimorfismo)
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
