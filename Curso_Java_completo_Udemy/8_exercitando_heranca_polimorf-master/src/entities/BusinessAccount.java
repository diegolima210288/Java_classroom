package entities;

//palavra "final" bloqueia o uso desta classe como superclasse
public final class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	private Account account = new Account();
	
	//metodo padrão
	public BusinessAccount() {
		super();
	}

	//metodo com argumentos (com argumentos da superclasse)
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	//metodos GETTERS e SETTERS
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//metodo para disponibilizar emprestimo
	public void loan(double amount) {
		//disponibilizar o emprestimo se o limite for maior ou igual ao solicitado
		if (loanLimit >= amount) {
			balance += amount - 10.0;
		}
	}
	
	//metodo para saque (utilizando funcionalidades da superclasse - sobreposição)
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
