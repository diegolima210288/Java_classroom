package entities;

public class Account {
	
	Integer number;
	String holder;
	Double balance;
	
	//metodo padrão
	public Account() {
		
	}
	
	//metodo com argumentos
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	//metodos GETTERS e SETTERS
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	//metodo para saque
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	//metodo para deposito
	public void deposit(double amount) {
		balance += amount;
	}
	
	

}
