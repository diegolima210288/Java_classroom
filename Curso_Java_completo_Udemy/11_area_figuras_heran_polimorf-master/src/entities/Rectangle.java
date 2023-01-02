package entities;

import entities.enums.Color;

//classe extensão da super classe Shape (herança) 
public class Rectangle extends Shape{
	
	//argumentos da própria classe
	private double width;
	private double height;
	
	//metodo padrão
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
	
	//metodo generico da super classe, porém com implementação desta classe (polimorfismo)
	@Override
	public double area() {
		return width * height;
	}

}
