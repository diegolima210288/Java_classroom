package entities;

import entities.enums.Color;

//como esta classe tem um metodo abstrato (genérico) a classe também teve que se tornar abstrata
//com isto ela não pode ser instanciada
public abstract class Shape {
	
	//argumentos de outra classe (composição)
	Color color;
	
	//metodo padrão
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
	
	//metodo abstrato, pois é genérico para cacular a area da forma geometrica
	public abstract double area();

}
