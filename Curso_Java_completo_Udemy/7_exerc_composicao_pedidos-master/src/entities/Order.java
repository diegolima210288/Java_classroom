package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//atributos
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	//metodo padrão
	public Order() {
		
	}

	//metodo com atributos
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	//obs: não é necessario acrescentar a lista neste metodo, porque há metodos de adcionamento e remoção de dados da lista
	

	//metodos GETTERS e SETTERS
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	//metodo para adicionar itens da ordem
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	//metodo para remover intes da ordem
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	//metodo para retornar o total
	public double total() {
		double sum = 0.0;
		//objeto item (tipo classe OrderItem) ira ler o elementos da lista
		//e somara os valores do metodo subTotal (classe OrderItem) a variavel local
		for(OrderItem item : itens) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		//objeto StringBuilder é utilizado para concatenar grande quantidade de informações
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)+"\n");
		sb.append("Order status: ");
		sb.append(status+"\n");
		sb.append("Client: ");
		sb.append(client+"\n");
		sb.append("Order items: \n");
		for (OrderItem item : itens) {
			sb.append(item+"\n");
		}
		sb.append("Total price: $");
		//para apresentar o valor do metodo total, basta cita-lo;
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	

}
