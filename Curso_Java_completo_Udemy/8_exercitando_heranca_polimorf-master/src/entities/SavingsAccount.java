package entities;

//palavra "final" bloqueia o uso desta classe como superclasse
public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	//metodo padrão
	public SavingsAccount() {
		
	}

	//metodo com argumentos (com argumentos da superclasse)
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	//metodo GETTERS e SETTERS
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//metodo para atualizar saldo
	public void updateBalance() {
		//saldo recebe juros sobre o seu valor
		balance += balance * interestRate;
	}
	
	//metodo para saque (utilizando funcionalidades da superclasse - sobreposição)
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
