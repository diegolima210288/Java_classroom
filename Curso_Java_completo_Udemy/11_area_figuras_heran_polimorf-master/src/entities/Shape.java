package entities;

import entities.enums.Color;

//como esta classe tem um metodo abstrato (gen�rico) a classe tamb�m teve que se tornar abstrata
//com isto ela n�o pode ser instanciada
public abstract class Shape {
	
	//argumentos de outra classe (composi��o)
	Color color;
	
	//metodo padr�o
	public Shape() {
		
	}

	//metodo com argumentos
	public Shape(Color color) {
		super();
		this.color = color;
	}

	//metodo GETTERS e SETTERS
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	//metodo abstrato, pois � gen�rico para cacular a area da forma geometrica
	public abstract double area();

}
